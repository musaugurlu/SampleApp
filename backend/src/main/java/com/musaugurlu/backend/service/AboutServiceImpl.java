package com.musaugurlu.backend.service;

import java.util.List;

import com.musaugurlu.backend.model.About;
import com.musaugurlu.backend.repository.AboutRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutServiceImpl implements AboutService {

    @Autowired
    AboutRepository aboutRepository;

    @Override
    public List<About> findAll() {
        return aboutRepository.findAll();
    }

    @Override
    public About save(About about) {
        return aboutRepository.save(about);
    }
    
}
