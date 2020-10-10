package com.xworkz.projecttask.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.projecttask.dto.AppInfoDTO;
import com.xworkz.projecttask.service.IAppInfoService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class AppInfoController {

	@Autowired
	private IAppInfoService iAppInfoService;

	public AppInfoController() {
		log.info(this.getClass().getSimpleName() + " is created");
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@GetMapping("/getAppInfo")
	public String getInfo() {
		log.info("invoking getInfo() of " + this.getClass().getSimpleName());
		return "appInfo";

	}

	@PostMapping("/saveAppInfo")
	public String saveAppInfo(Model model, AppInfoDTO appInfoDTO) {
		log.info(" invoking saveAppInfo() of {}", this.getClass().getSimpleName());
		log.info("Environment ::> {} ", appInfoDTO);

		 appInfoDTO = iAppInfoService.validateAndSaveAppInfoDetails(appInfoDTO);
		if (appInfoDTO.getId() != null) {
			model.addAttribute("msg", "Application info saved successfully.");
		} else {
			model.addAttribute("msg", "Application info is not getting saved.");
		}
		return "appInfo";

	}
}
