package com.musaugurlu.backend.service;

import java.util.List;

import com.musaugurlu.backend.model.Team;
import com.musaugurlu.backend.repository.TeamRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    TeamRepository teamRepository;

    @Override
    public List<Team> findAll() {
        return teamRepository.findAll();
    }

    @Override
    public Team save(Team team) {
        return teamRepository.saveAndFlush(team);
    }
    
}
