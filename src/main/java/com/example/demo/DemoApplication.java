package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Removed @SpringBootApplication to avoid conflict with MessagingStompWebsocketApplication
public class DemoApplication {

	public static void main(String[] args) {
		// Updated to use MessagingStompWebsocketApplication as the Spring Boot application
		SpringApplication.run(MessagingStompWebsocketApplication.class, args);
	}

}
