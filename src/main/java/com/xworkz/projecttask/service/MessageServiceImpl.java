package com.xworkz.projecttask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.projecttask.dto.MessageDTO;
import com.xworkz.projecttask.entity.MessageEntity;
import com.xworkz.projecttask.repository.IMessageRepository;

import ch.qos.logback.core.db.dialect.MsSQLDialect;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MessageServiceImpl implements IMessageService {
	@Autowired
	private IMessageRepository messageRepository;

	public MessageServiceImpl() {
		log.info(this.getClass().getSimpleName() + " is created");
	}

	public MessageDTO convertAndSaveMessageDetails(MessageDTO messageDTO) {
		log.info("invoking convertAndSaveMessageDetails() " + this.getClass().getSimpleName());
		try {
			MessageEntity messageEntity = new MessageEntity();
			messageEntity.setFrom(messageDTO.getFrom());
			messageEntity.setMessage(messageDTO.getMessage());
			messageEntity = messageRepository.save(messageEntity);
			if (messageEntity.getId() != null) {
				messageDTO.setId(messageEntity.getId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return messageDTO;
	}

}
