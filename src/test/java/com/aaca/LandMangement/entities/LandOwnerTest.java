package com.aaca.LandMangement.entities;

import org.junit.jupiter.api.Test;

import javax.validation.Valid;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LandOwnerTest {
@Test
    public void testSortLandOwnerById(){
    LandOwner landOwner = new LandOwner(20,"eron","Tadesse");

    LandOwner landOwner1 = new LandOwner(23,"fitsum","shiferaw");

    LandOwner landOwner2 = new LandOwner(11,"meron","Tadesse");

    List<LandOwner> ownerList = Arrays.asList(landOwner,landOwner1,landOwner2);

    Collections.sort(ownerList);
    System.out.println(ownerList);
}
}