package com.musaugurlu.backend.service;

import java.util.List;

import com.musaugurlu.backend.model.Gallery;
import com.musaugurlu.backend.repository.GalleryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GalleryServiceImpl implements GalleryService {

    @Autowired
    GalleryRepository galleryRepository;

    @Override
    public List<Gallery> findAll() {
        return galleryRepository.findAll();
    }

    @Override
    public Gallery save(Gallery gallery) {
        return galleryRepository.save(gallery);
    }
    
}
