package com.aaca.LandMangement.service;

import com.aaca.LandMangement.model.Land;

import java.util.List;

public interface LandService {
    public List<Land> getAllLand();
    public Land getLand(long landId);
    public Land createLand(Land land);
}
