package com.musaugurlu.backend.service;

import java.util.List;

import com.musaugurlu.backend.model.Contact;

public interface ContactService {
    List<Contact> findAll();
    Contact save(Contact contact);
}
