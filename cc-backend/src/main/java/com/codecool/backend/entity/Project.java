package com.codecool.backend.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Entity
@Table(name = "project")
@Data
@EqualsAndHashCode(exclude = "team")
public class Project {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    private String title;

    @NotEmpty
    private String url;

    @NotEmpty
    @Column(name = "created_at")
    private LocalDate createdAt;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @PrePersist
    private void setCreatedAt() {
        this.createdAt = LocalDate.now();
    }
}
