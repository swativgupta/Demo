package com.exercise.demo1.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceInfosRepository extends JpaRepository<ServiceInfos,Long> {
    ServiceInfos findByName(String name);
    List<ServiceInfos> findAll();
}
