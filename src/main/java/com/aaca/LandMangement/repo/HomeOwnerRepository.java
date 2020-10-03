package com.aaca.LandMangement.repo;

import com.aaca.LandMangement.entities.HomeOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeOwnerRepository extends JpaRepository<HomeOwner,Long> {
}
