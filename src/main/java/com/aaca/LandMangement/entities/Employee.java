package com.aaca.LandMangement.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;
@Setter
@Getter
@Builder
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    @NotNull
    private String firsName ;
    @NotNull
    private String lastName;
    @NotNull
    private String title;
    @NotNull
    private Date hiredDate;
}
