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
public class EnvironmentDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5808473721016119461L;
	
	private String environment;
	private String url;
	private Boolean isAccessible;
	
	public EnvironmentDTO() {
		log.info(this.getClass().getSimpleName()+" is created");
	}

}
