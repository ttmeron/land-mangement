package com.aaca.LandMangement.service;

import com.aaca.LandMangement.entities.Land;
import com.aaca.LandMangement.entities.LandAddress;
import com.aaca.LandMangement.repo.LandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service("LandServiceImpl")
public class LandServiceImpl implements LandService{
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    LandRepository landRepository;
    @Value("server.port")
    String portNumber;

       @Override
    public List<Land> getAllLand() {

        return landRepository.findAll();
    }

    @Override
    public Land getLand(Long landId) {
        return landRepository.findById(landId).get();
    }

    @Override
    public Land createLand(Land land) {
       int landAddressId = land.getLandId();
        ResponseEntity<LandAddress> responseEntity = restTemplate.getForEntity("http://localhost:9080/landAddressManagement/landAddress/"+ landAddressId, LandAddress.class);
        LandAddress landAddress = responseEntity.getBody();
        land.setXCoordinate(landAddress.getXCoordinate());
        land.setYCoordinate(landAddress.getYCoordinate());
        return landRepository.save(land);
    }
}
