package com.aaca.LandMangement.entities;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.*;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class HomeOwnerTest {
    @Test
    public void testSortHomeOwnerByFnameAndLname(){
        List<HomeOwner> homeOwnerList1 = Arrays.asList(new HomeOwner(90,"Betre ","Tek"),
                                                       new HomeOwner(100,"Betre ","Girma"),
                                                       new HomeOwner(66,"Alem ","Girma")
        );
        homeOwnerList1
                      .stream()
                      .map(s->s.getFName())
                    //  .findFirst()
                      .map(s->s.toUpperCase())
                      .forEach(System.out::println);

        homeOwnerList1.sort((s1,s2)->s1.getFName().compareTo(s2.getFName()));
        homeOwnerList1.sort((s1,s2)-> s1.getLName().compareTo(s2.getLName()));
        homeOwnerList1.sort((s1,s2)-> Integer.compare(s1.getOwnerId(),s2.getOwnerId()));
        System.out.println(homeOwnerList1);

    }

}
