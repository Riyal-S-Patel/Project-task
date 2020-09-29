package com.xworkz.projecttask.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
@Slf4j
public class MessageDTO implements Serializable {
	private Integer id;
	private String from;
	private String message;
	public MessageDTO() {
		log.info(this.getClass().getSimpleName() + " is created");
	}
}
