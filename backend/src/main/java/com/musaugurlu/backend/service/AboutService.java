package com.musaugurlu.backend.service;

import java.util.List;

import com.musaugurlu.backend.model.About;

public interface AboutService {
    List<About> findAll();
    About save(About about);
}
