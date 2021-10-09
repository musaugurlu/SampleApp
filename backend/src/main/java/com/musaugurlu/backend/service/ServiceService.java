package com.musaugurlu.backend.service;

import java.util.List;

import com.musaugurlu.backend.model.Service;

public interface ServiceService {
    List<Service> findAll();

    Service save(Service service);
}
