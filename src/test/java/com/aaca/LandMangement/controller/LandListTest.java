package com.aaca.LandMangement.controller;

import com.aaca.LandMangement.entities.Land;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class LandListTest {

    @Test
    void getLands() {
        List<Land> getLandsArea = Arrays.asList(new Land(4,432,4646,9494,"green"),
                                                new Land(5,324,4346,9594,"life"),
                                                new Land(6,224,4246,9694,"industry"));
        getLandsArea.stream()
                .map(s->s.getXCoordinate())
//                .sorted((s1,s2)-> ((Integer) s1.getXCoordinate()).compareTo(s2.getXCoordinate()))
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }
}