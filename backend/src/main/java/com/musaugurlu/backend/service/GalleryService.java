package com.musaugurlu.backend.service;

import java.util.List;

import com.musaugurlu.backend.model.Gallery;

public interface GalleryService {
    List<Gallery> findAll();

    Gallery save(Gallery gallery);
}
