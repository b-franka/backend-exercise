package com.codecool.backend.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
@Table(name = "users")
@Data
@ToString(exclude = "teams")
@EqualsAndHashCode(exclude = "teams")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    private String location;

    @NotEmpty
    @Column(name = "first_name")
    private String firstName;

    @NotEmpty
    @Column(name = "last_name")
    private String lastName;

    @ManyToMany(mappedBy = "users")
    Set<Team> teams;
}
