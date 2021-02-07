package com.codecool.backend.service;

import com.codecool.backend.dto.ProjectDto;
import com.codecool.backend.entity.Project;
import com.codecool.backend.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Service
public class ProjectServiceImpl implements ProjectService {

    private final AvatarService avatarService;
    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectServiceImpl(AvatarService avatarService, ProjectRepository projectRepository) {
        this.avatarService = avatarService;
        this.projectRepository = projectRepository;
    }

    @Override
    public List<ProjectDto> getAll() {
        List<Project> projects = projectRepository.findAll();
        return projects.stream().map(this::mapProject).collect(Collectors.toList());
    }

    private ProjectDto mapProject(Project projectEntity) {
        ProjectDto projectDto = new ProjectDto();
        projectDto.setTitle(projectEntity.getTitle());
        projectDto.setUrl(projectEntity.getUrl());
        projectDto.setCreated(projectEntity.getCreatedAt());
        projectDto.setTeamAvatarUrls(projectEntity.getTeam().getUsers().stream()
                .map((user) -> avatarService.getUrlByUser(user.getId()))
                .collect(Collectors.toList()));
        return projectDto;
    }
}
