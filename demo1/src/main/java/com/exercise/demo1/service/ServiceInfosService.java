package com.exercise.demo1.service;

import com.exercise.demo1.model.ServiceInfos;
import com.exercise.demo1.model.ServiceInfosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceInfosService {

    @Autowired
    private ServiceInfosRepository repository;

    public ServiceInfos findByName(String name) {
        return repository.findByName(name);
    }

    public List<ServiceInfos> findAll() {
        return findAll();
    }
}
