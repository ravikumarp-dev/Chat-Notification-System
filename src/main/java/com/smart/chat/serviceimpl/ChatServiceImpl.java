package com.smart.chat.serviceimpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.chat.common.ResourceNotFoundException;
import com.smart.chat.entity.MessageBo;
import com.smart.chat.repositary.ChatRepositary;
import com.smart.chat.service.ChatService;
@Service
public class ChatServiceImpl implements ChatService{

	@Autowired
	ChatRepositary  chatRepositary;
	
	@Override
	public MessageBo saveUserMessage(MessageBo bo) {		
		bo.setTimeStamp(LocalDateTime.now()); 
		return chatRepositary.save(bo);
	}

	@Override
	public List<MessageBo> getAllUserMessage() {		
		return chatRepositary.findAll();
	}

	@Override
	public List<MessageBo> getMessageByUserId(String user_id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		
		List<MessageBo> returnBo=chatRepositary.findBysenderId(user_id);
	
		if(returnBo==null ||returnBo.isEmpty())
			 throw new ResourceNotFoundException("Resource Not Found Exception");
		return chatRepositary.findBysenderId(user_id);
	}

	@Override
	public MessageBo editUserMessage(long msg_id, MessageBo bo) {
		// TODO Auto-generated method stub

		return chatRepositary.save(bo);
	}

}
