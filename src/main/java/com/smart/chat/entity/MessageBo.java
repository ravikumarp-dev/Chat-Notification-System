package com.smart.chat.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class MessageBo 
{
	private long msgId;
	private String senderId;
	private String receiverId;
	private String message;
	private String status;
	private LocalDateTime timeStamp;
	
	
}
