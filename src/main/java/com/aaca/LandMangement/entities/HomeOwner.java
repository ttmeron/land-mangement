package com.aaca.LandMangement.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Comparator;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public  class HomeOwner implements Comparator<HomeOwner> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ownerId;
    private String fName,lName;


    public String toString() {
        return this.ownerId +" "+ this.fName +"" + this.lName;
    }

    @Override
    public int compare(HomeOwner o1, HomeOwner o2) {

        return o1.getFName().compareTo(o2.getFName());
    }
}
