package com.codecool.backend.controller;

import com.codecool.backend.dto.ProjectDto;
import com.codecool.backend.service.ProjectService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/project")
public class ProjectRestController {

    private ProjectService projectService;

    public ProjectRestController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/all")
    public List<ProjectDto> getAll() {
        return projectService.getAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/avg-xp")
    public List<ProjectDto> getAverageXPByTechnology() {
        return projectService.getAll();
    }

}
