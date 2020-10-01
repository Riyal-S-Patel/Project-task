package com.xworkz.projecttask.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@Entity
@Table(name = "message_details")
public class MessageEntity implements Serializable {
	@Id
	@GenericGenerator(name = "ref", strategy = "increment")
	@GeneratedValue(generator = "ref")
	@Column(name = "ID")
	private Integer id;
	@Column(name = "FROM_USER")
	private String from;
	@Column(name = "MESSAGE")
	private String message;

	public MessageEntity() {
		log.info(this.getClass().getSimpleName() + " is created");
	}

}
