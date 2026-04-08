package com.smart.chat.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.chat.entity.MessageBo;

@Repository
public interface ChatRepositary  extends JpaRepository<MessageBo, Long>{
	
	List<MessageBo> findBysenderId(String user_id);

}
