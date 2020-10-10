package com.xworkz.projecttask.util;

import org.mapstruct.Mapper;

import com.xworkz.projecttask.dto.MessageDTO;
import com.xworkz.projecttask.entity.MessageEntity;

@Mapper(componentModel = "spring")
public interface IMessageMapper {

	MessageEntity convertDTOToEntity(MessageDTO dto);
}
