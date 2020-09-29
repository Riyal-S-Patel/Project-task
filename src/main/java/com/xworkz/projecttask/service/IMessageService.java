package com.xworkz.projecttask.service;

import com.xworkz.projecttask.dto.MessageDTO;

public interface IMessageService {
	public MessageDTO convertAndSaveMessageDetails(MessageDTO messageDTO);
}
