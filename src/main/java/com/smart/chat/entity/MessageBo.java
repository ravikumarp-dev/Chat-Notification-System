package com.smart.chat.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class MessageBo 
{
	@Id
	private long msgId;
	private String senderId;
	private String receiverId;
	@NotNull
	private String message;
	private String status;
	private LocalDateTime timeStamp;

	
}
