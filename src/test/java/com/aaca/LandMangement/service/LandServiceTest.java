package com.aaca.LandMangement.service;

import com.aaca.LandMangement.entities.Land;
import com.aaca.LandMangement.repo.LandRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class LandServiceTest {

    private LandService landService;

    @Mock
    private LandRepository landRepository;

//    @BeforeEach
//    public void init() {
//        landService = new LandServiceImpl(landRepository);
//    }

    @Test
    void getAllLand() {

        //given
        Land l0 = Land.builder().area(45).build();
        Land l1 = Land.builder().area(50).build();

        List<Land> landList = new ArrayList<>();
        landList.add(l0);
        landList.add(l1);

        when(landRepository.findAll()).thenReturn(landList);

        List<Land> lands = landService.getAllLand();

        assertEquals(2,lands.size());
    }

    @Test
    void getLand() {
        Land l0 = Land.builder().area(45).build();
        when(landRepository.findById(any())).thenReturn(java.util.Optional.ofNullable(l0));

        //when
        Land actual = landService.getLand(1L);
        assertEquals(45,actual.getArea());

    }

    @Test
    void createLand() {
    }
}