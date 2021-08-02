package com.exercise.demo1.controller;

import com.exercise.demo1.model.ServiceInfos;
import com.exercise.demo1.model.ServiceInfosRepository;
import com.exercise.demo1.service.ServiceInfosService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ServiceInfosController {
    private final Logger log = LoggerFactory.getLogger(ServiceInfosController.class);

    @Autowired
    private ServiceInfosService serviceInfosService;

    /*public ServiceInfosController(ServiceInfosRepository serviceInfosRepository) {
        this.serviceInfosRepository = serviceInfosRepository;
    }*/

    @GetMapping("/serviceInfos")
    List<ServiceInfos> serviceInfos() {
        return serviceInfosService.findAll();
    }

    /*@PostMapping("/serviceInfos")
    ResponseEntity<ServiceInfos> createServiceInfos(@RequestBody ServiceInfos serviceInfos) throws URISyntaxException {
        log.info("Request to create group: {}", serviceInfos);
        ServiceInfos result = (ServiceInfos) serviceInfosRepository.save(serviceInfos);
        return ResponseEntity.created(new URI("/api/serviceInfos/" + result.getId()))
                .body(result);
    }*/

}
