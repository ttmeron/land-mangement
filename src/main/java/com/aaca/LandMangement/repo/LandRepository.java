package com.aaca.LandMangement.repo;

import com.aaca.LandMangement.model.Land;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LandRepository extends JpaRepository <Land, Long> {
}
