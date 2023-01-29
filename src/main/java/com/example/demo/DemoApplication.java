package com.example.demo;

import com.azure.cosmos.CosmosClient;
import com.azure.cosmos.CosmosClientBuilder;
import com.azure.cosmos.CosmosDatabase;
import com.example.demo.domain.FantasyDataResponse;
import com.example.demo.domain.PlayerData;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;

@SpringBootApplication
@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		return "Hello Azure World!";
	}

	@RequestMapping("/yo")
	String sayHey() {
		return "Heyoooo!";
	}

	@RequestMapping(value = "/fetchTestData")
	public @ResponseBody
	FantasyDataResponse fetchTestData(){
		FantasyDataResponse response = new FantasyDataResponse();
		response.setName("test player data");
		response.setSuccess(true);
		ArrayList<PlayerData> data = new ArrayList<>();
		for(int i=0; i<10; i++){
			PlayerData record = new PlayerData();

			record.setName("playerName"+i);
			record.setRecYds(12+i);
			record.setRushYds(15+i);
			record.setRecRec(80-i);

			data.add(record);
		}
		response.setData(data);
		return response;
	}

	@RequestMapping(value = "/fetchData")
	public @ResponseBody
	FantasyDataResponse fetchData(){
		FantasyDataResponse response = new FantasyDataResponse();
		response.setName("build data file");
		response.setSuccess(false);

		try{
			String fileName = "rawFantasyData.gzip";
			String endpoint = "cosdbacc.mongo.cosmos.azure.com:443/";
			String cosmosKey = "1c5d2a44-9023-47ba-9896-7be9efe43ba3";
			String encodedEndpoint = new String(Base64.getEncoder().encode(endpoint.getBytes(StandardCharsets.UTF_8)));
			String encodedKey = new String(Base64.getEncoder().encode(cosmosKey.getBytes(StandardCharsets.UTF_8)));

			MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://cosdbacc:EGw6GbaWqxSPzLjZWoauURc0ARd9tyyxJE3Rpon1y991wU8rYYUd9jg1a7cZdWvoRKLsnHc74A6zTJb5PAdS7g==@cosdbacc.mongo.cosmos.azure.com:10255/?ssl=true&retrywrites=false&replicaSet=globaldb&maxIdleTimeMS=120000&appName=@cosdbacc@"));
			MongoDatabase db = mongoClient.getDatabase("db");
			MongoCollection<Document> data2 = db.getCollection("coll");

			List<Document> list = data2.find().into(new ArrayList<Document>());

			list.get(0).toJson();

			FindIterable<Document> iterDoc = data2.find();
			Iterator it = iterDoc.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}

			response.setData(list);
			response.setSuccess(true);

			// It only requires endpoint and key, but other useful settings are available
//			CosmosAsyncClient cosmosAsyncClient = new CosmosClientBuilder()
//					.endpoint(encodedEndpoint)
//					.key(encodedKey)
//					.buildAsyncClient();


// Create a new CosmosClient via the CosmosClientBuilder
			CosmosClient cosmosClient = new CosmosClientBuilder()
					.endpoint(encodedEndpoint)
					.key(encodedKey)
					.buildClient();

			CosmosDatabase cosmosDatabase = cosmosClient.getDatabase("appData");

			System.out.println(cosmosDatabase.getId());
		} catch (Exception ex){
			response.setDetails(ex.getMessage());
			response.setData(ex);
		}
		return response;
	}
}
