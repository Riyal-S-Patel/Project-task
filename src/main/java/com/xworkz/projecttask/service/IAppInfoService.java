package com.xworkz.projecttask.service;

import com.xworkz.projecttask.dto.AppInfoDTO;

public interface IAppInfoService {
	public AppInfoDTO validateAndSaveAppInfoDetails(AppInfoDTO appInfoDTO);
}
