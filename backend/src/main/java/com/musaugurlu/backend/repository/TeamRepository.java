package com.musaugurlu.backend.repository;

import com.musaugurlu.backend.model.Team;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {
    
}
