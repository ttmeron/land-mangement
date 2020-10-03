package com.aaca.LandMangement.entities;

import lombok.*;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Land {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int landId;
    private int area;
    private int xCoordinate;
    private int YCoordinate;
    private String landType;
//    @OneToOne(cascade=CascadeType.ALL)
//    private Address address;
    }
