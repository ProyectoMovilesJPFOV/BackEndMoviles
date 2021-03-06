package com.example.BackEndMoviles;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.example.BackEndMoviles.modelo.Response;
import com.example.BackEndMoviles.services.MovilService;

class ResponseTest {
	
	

	@Test
	void test() {
		
		MovilService movilService = new MovilService();
		
		Response response= Response.builder()
				.TimeStamp(LocalDateTime.now())
				.Status(HttpStatus.OK)
				.Message("currito que sabe")
				.Data(Map.of("moviles", movilService.getMoviles()))
				.build();
		System.out.println(response.getData().get("moviles").toString());
	}

}
