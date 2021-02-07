package com.codecool.backend.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@EqualsAndHashCode(of = {"technologyId", "userId"})
public class TechnologyXPKey implements Serializable {

    @Column(name = "technology_id")
    Long technologyId;

    @Column(name = "user_id")
    Long userId;
}
