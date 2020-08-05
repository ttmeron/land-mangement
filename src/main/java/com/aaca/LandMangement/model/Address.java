package com.aaca.LandMangement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Address() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBulidingNmumber(int bulidingNmumber) {
        this.bulidingNmumber = bulidingNmumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getBulidingNmumber() {
        return bulidingNmumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipcode() {
        return zipcode;
    }
}
