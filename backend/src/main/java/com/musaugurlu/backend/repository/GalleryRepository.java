package com.musaugurlu.backend.repository;

import com.musaugurlu.backend.model.Gallery;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GalleryRepository extends JpaRepository<Gallery, Integer> {
    
}
