package com.example.demo;

import com.example.demo.domain.FantasyDataResponse;
import com.example.demo.domain.PlayerData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

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
}
