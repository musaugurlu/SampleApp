package com.musaugurlu.backend.service;

import java.util.List;

import com.musaugurlu.backend.model.Header;
import com.musaugurlu.backend.repository.HeaderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeaderServiceImpl implements HeaderService {

    @Autowired
    HeaderRepository headerRepository;

    @Override
    public List<Header> findAll() {
        return headerRepository.findAll();
    }

    @Override
    public Header save(Header header) {
        return headerRepository.save(header);
    }
    
}
