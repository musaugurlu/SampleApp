package com.musaugurlu.backend.repository;

import com.musaugurlu.backend.model.About;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AboutRepository extends JpaRepository<About, Integer> {
    
}
