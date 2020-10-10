package com.xworkz.projecttask.util;

import org.mapstruct.Mapper;

import com.xworkz.projecttask.dto.AppInfoDTO;
import com.xworkz.projecttask.entity.AppInfoEntity;

@Mapper(componentModel = "spring")
public interface IAppInfoMapper {
	AppInfoEntity convertDTOToEntity(AppInfoDTO dto);
}
