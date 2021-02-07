package com.codecool.backend.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "technology")
@Data
public class Technology {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    private String title;

}
