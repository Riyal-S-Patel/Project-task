package com.xworkz.projecttask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.projecttask.dto.MessageDTO;
import com.xworkz.projecttask.service.MessageServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class MessageController {
	@Autowired
	private MessageServiceImpl messageService;

	public MessageController() {
		log.info(this.getClass().getSimpleName() + " is created.!!");
	}

	@PostMapping("/postmsg")
	public String postMessage(MessageDTO messageDTO, Model model) {
		log.info("invoking postMessage() from " + this.getClass().getSimpleName());
		try {
			messageDTO = messageService.convertAndSaveMessageDetails(messageDTO);
			if (messageDTO.getId() != null) {
				log.info("data is valid");
				model.addAttribute("id", messageDTO.getId());
				model.addAttribute("msg", messageDTO.getMessage());
				model.addAttribute("from", messageDTO.getFrom());
				return "success";
			} else {
				log.info("data is invalid");
				model.addAttribute("errorMessage", "data is not getting saved ");
				return "index";
			}
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return "index";

	}
}
