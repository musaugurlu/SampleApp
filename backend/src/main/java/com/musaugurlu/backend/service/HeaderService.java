package com.musaugurlu.backend.service;

import java.util.List;

import com.musaugurlu.backend.model.Header;

public interface HeaderService {
    List<Header> findAll();

    Header save(Header header);
}
