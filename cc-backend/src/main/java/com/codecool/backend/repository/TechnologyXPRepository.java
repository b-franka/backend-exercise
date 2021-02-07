package com.codecool.backend.repository;

import com.codecool.backend.entity.TechnologyXP;
import com.codecool.backend.entity.TechnologyXPKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnologyXPRepository extends JpaRepository<TechnologyXP, TechnologyXPKey> {
}
