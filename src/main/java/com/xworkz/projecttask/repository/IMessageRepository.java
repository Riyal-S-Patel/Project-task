package com.xworkz.projecttask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xworkz.projecttask.entity.MessageEntity;

public interface IMessageRepository extends JpaRepository<MessageEntity, Integer> {

}
