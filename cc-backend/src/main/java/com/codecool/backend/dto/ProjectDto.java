package com.codecool.backend.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ProjectDto {

    private String title;
    private String url;
    private LocalDate created;
    private List<String> teamAvatarUrls;

}
