package com.musaugurlu.backend.repository;

import com.musaugurlu.backend.model.Contact;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
    
}
