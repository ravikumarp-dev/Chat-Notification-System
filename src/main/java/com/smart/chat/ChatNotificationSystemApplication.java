package com.smart.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatNotificationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatNotificationSystemApplication.class, args);
		
		System.out.println("Welcome to Chat Notification System");
	}

}
