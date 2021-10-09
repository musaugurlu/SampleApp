package com.musaugurlu.backend.service;

import java.util.List;

import com.musaugurlu.backend.model.Contact;
import com.musaugurlu.backend.repository.ContactRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    ContactRepository contactRepository;

    @Override
    public List<Contact> findAll() {
        return contactRepository.findAll();
    }

    @Override
    public Contact save(Contact contact) {
        return contactRepository.save(contact);
    }
    
}
