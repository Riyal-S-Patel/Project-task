package com.xworkz.projecttask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class PageResolver {
	@RequestMapping("/")
	public static String indexPage() {
		log.info("invoking indexpage()");
		return "index";
	}
}
