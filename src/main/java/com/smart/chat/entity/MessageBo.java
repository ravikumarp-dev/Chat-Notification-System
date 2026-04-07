package com.smart.chat.entity;

import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class MessageBo 
{
	private long msgId;
	private String senderId;
	private String receiverId;
	private String message;
	private String status;
	private LocalDateTime timeStamp;
	
	public long getMsgId() {
		return msgId;
	}
	public void setMsgId(long msgId) {
		this.msgId = msgId;
	}
	public String getSenderId() {
		return senderId;
	}
	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}
	public String getReceiverId() {
		return receiverId;
	}
	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
}
