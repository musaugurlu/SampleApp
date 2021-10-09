package com.musaugurlu.backend.service;

import java.util.List;

import com.musaugurlu.backend.repository.ServiceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    ServiceRepository serviceRepository;

    @Override
    public List<com.musaugurlu.backend.model.Service> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public com.musaugurlu.backend.model.Service save(com.musaugurlu.backend.model.Service service) {
        return serviceRepository.saveAndFlush(service);
    }
    
}
