package com.musaugurlu.backend.service;

import java.util.List;

import com.musaugurlu.backend.model.Team;

public interface TeamService {
    List<Team> findAll();

    Team save(Team team);
}
