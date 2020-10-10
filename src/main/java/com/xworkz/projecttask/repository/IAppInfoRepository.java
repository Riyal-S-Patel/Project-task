package com.xworkz.projecttask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xworkz.projecttask.entity.AppInfoEntity;

public interface IAppInfoRepository extends JpaRepository<AppInfoEntity, Integer> {

}
