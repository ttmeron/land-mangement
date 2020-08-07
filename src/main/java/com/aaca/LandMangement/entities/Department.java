package com.aaca.LandMangement.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Setter
@Getter
@Builder
@Entity

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int dptId;
    private String dptName;
    private String dptHead;


}
