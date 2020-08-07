package com.aaca.LandMangement.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Address {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String streetName;
    private int bulidingNmumber;
    private String city;
    private String state;
    private int zipcode;
   }
