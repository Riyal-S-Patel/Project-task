package com.xworkz.projecttask.repository;

import org.springframework.data.repository.CrudRepository;

import com.xworkz.projecttask.entity.MessageEntity;

public interface IMessageRepository extends CrudRepository<MessageEntity, Integer> {

}
