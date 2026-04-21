package com.smart.chat.common;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ExceptionResponse {

	    private String message;
	    private int statusCode;
	    private LocalDateTime timestamp;

	    public ExceptionResponse(String message, int statusCode, LocalDateTime timestamp) {
	        this.message = message;
	        this.statusCode = statusCode;
	        this.timestamp = timestamp;
	    }
}
