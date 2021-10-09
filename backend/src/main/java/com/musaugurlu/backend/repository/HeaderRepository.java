package com.musaugurlu.backend.repository;

import com.musaugurlu.backend.model.Header;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HeaderRepository extends JpaRepository<Header, Integer> {
    
}
