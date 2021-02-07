package com.codecool.backend.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
@Table(name = "team")
@Data
@ToString(exclude = {"projects", "users"})
@EqualsAndHashCode(exclude = {"projects", "users"})
public class Team {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    private String title;

    @NotEmpty
    private String url;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "team")
    private Set<Project> projects;

    @ManyToMany
    @JoinTable(
            name = "user_to_team",
            joinColumns = @JoinColumn(name = "team_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<User> users;
}
