package com.example.demo;

import com.example.demo.domain.FantasyDataResponse;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoApplicationTests {

	@InjectMocks
	private DemoApplication app;

	@Test
	void contextLoads() {
	}

	@Test
	public void fetchTestDataTest(){
		FantasyDataResponse testResp = app.fetchTestData();
		assertTrue(testResp.isSuccess());
		assertNotNull(testResp.getData());
	}

	@Test
	public void fetchDataTest(){
		FantasyDataResponse testResp = app.fetchData();
		assertTrue(testResp.isSuccess());
		assertNotNull(testResp.getData());
	}

}
