package com.codecool.backend.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "technology_to_user")
@Data
public class TechnologyXP {

    @EmbeddedId
    TechnologyXPKey id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
    @MapsId("technologyId")
    @JoinColumn(name = "technology_id")
    Technology technology;

    @Column(name = "experience_point")
    Integer experiencePoint;
}
