package com.example.sqlite.demosqlite;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

@SpringBootApplication
public class DemosqliteApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemosqliteApplication.class, args);
	}

}
