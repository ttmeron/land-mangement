package com.aaca.LandMangement.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
public class LandAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long landAddressId;
    private String landName;
    private int xCoordinate;
    private int yCoordinate;

}
