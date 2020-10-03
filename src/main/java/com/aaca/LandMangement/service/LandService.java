package com.aaca.LandMangement.service;

import com.aaca.LandMangement.entities.Land;

import java.util.List;

public interface LandService {
    public List<Land> getAllLand();
    public Land getLand(Long landId);
    public Land createLand(Land land);
}
