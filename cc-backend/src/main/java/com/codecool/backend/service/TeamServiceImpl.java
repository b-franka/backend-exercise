package com.codecool.backend.service;

import com.codecool.backend.dto.TeamDto;
import com.codecool.backend.repository.TeamRepository;
import com.codecool.backend.service.serviceinterface.TeamService;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements TeamService {

    private TeamRepository teamRepository;

    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public TeamDto getTeamByAverageXP() {
        return null;
    }
}
