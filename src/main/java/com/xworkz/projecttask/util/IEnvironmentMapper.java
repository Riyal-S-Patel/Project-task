package com.xworkz.projecttask.util;

import java.util.List;

import org.mapstruct.Mapper;

import com.xworkz.projecttask.dto.EnvironmentDTO;
import com.xworkz.projecttask.entity.EnvironmentEntity;

@Mapper(componentModel = "spring")
public interface IEnvironmentMapper {

	public List<EnvironmentEntity> convertDTOToEntity(List<EnvironmentDTO> list) ;
}
