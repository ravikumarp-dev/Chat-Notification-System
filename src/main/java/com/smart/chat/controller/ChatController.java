package com.smart.chat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.chat.common.MethodInfo;
import com.smart.chat.common.ResourceNotFoundException;
import com.smart.chat.entity.MessageBo;
import com.smart.chat.service.ChatService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/chat")
public class ChatController
{
	
	@Autowired
	ChatService chatService;

	
	@PostMapping("/saveUserMessage")
	@MethodInfo(author = "Ravi", author_desc = " save API for chat message ", crt_date = "08/04/2026")
	public ResponseEntity<MessageBo>  saveUserMessage(@Valid @RequestBody MessageBo bo,HttpServletRequest req,HttpServletResponse res )
	{ 
		MessageBo saved=chatService.saveUserMessage(bo);		
		return ResponseEntity.ok(saved);
	}
	
	
	@GetMapping("/getAllUserMessage")
	@MethodInfo(author = "Ravi", author_desc = " get All user messages", crt_date = "08/04/2026")
	public List<MessageBo> getAllUserMessage()
	{	
		return chatService.getAllUserMessage();		
	}
	
	
	@GetMapping("/getMessageByUserId/{user_id}")
	public List<MessageBo> getMessageByUserId(@PathVariable String user_id) throws ResourceNotFoundException
	{
		return chatService.getMessageByUserId(user_id);		
	}
	
	@PutMapping("/editUserMessage/{msg_id}")
	public ResponseEntity<MessageBo> editUserMessage(@PathVariable long msg_id,MessageBo bo)
	{
		MessageBo updated=chatService.saveUserMessage(bo);		
		return ResponseEntity.ok(updated);
		
	}
	
	
}
