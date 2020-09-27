package com.xworkz.projecttask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.projecttask.dto.MessageDTO;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class MessageController {
	@PostMapping("/postmsg")
	public String postMessage(MessageDTO messageDTO, Model model) {
		log.info("invoking postMessage()");
		model.addAttribute("msg", messageDTO.getMessage());
		model.addAttribute("from", messageDTO.getFrom());
		return "success";
	}
}
