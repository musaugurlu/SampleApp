package com.musaugurlu.backend.repository;

import com.musaugurlu.backend.model.Service;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Integer> {
    
}
