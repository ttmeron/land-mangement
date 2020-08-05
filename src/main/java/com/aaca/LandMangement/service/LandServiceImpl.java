package com.aaca.LandMangement.service;

import com.aaca.LandMangement.model.Land;
import com.aaca.LandMangement.repo.LandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LandServiceImpl implements LandService{
    @Autowired
    LandRepository landRepository;
    @Override
    public List<Land> getAllLand() {
        return landRepository.findAll();
    }

    @Override
    public Land getLand(long landId) {
        return landRepository.findById(landId).get();
                //findById(landId).get();
    }

    @Override
    public Land createLand(Land land) {
        return landRepository.save(land);
    }
}
