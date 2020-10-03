package com.aaca.LandMangement.service;

import com.aaca.LandMangement.entities.HomeOwner;
import com.aaca.LandMangement.repo.HomeOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeOwnerServiceImpl implements HomeOwnerService{
    @Autowired
    HomeOwnerRepository homeOwnerRepository;
    @Override
    public List<HomeOwner> getAllHomeOwners() {
        return homeOwnerRepository.findAll();
    }

    @Override
    public HomeOwner getHomeOwner(Long ownerId) {
        return homeOwnerRepository.findById(ownerId).get();
    }
}
