package com.smart.chat.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.smart.chat.common.ResourceNotFoundException;
import com.smart.chat.entity.MessageBo;

@Service
public interface ChatService {
	
	MessageBo saveUserMessage(MessageBo bo);
	List<MessageBo> getAllUserMessage();
	List<MessageBo> getMessageByUserId(String user_id) throws ResourceNotFoundException;
	MessageBo editUserMessage(long msg_id,MessageBo bo);


}
