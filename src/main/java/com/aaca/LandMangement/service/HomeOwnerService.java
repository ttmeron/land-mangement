package com.aaca.LandMangement.service;

import com.aaca.LandMangement.entities.HomeOwner;

import java.util.List;

public interface HomeOwnerService {
    public List<HomeOwner> getAllHomeOwners();
    public HomeOwner getHomeOwner(Long ownerId);
}
