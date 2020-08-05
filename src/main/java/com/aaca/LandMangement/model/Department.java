package com.aaca.LandMangement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int dptId;
    private String dptName;
    private String dptHead;

    public int getDptId() {
        return dptId;
    }

    public void setDptId(int dptId) {
        this.dptId = dptId;
    }

    public String getDptName() {
        return dptName;
    }

    public void setDptName(String dptName) {
        this.dptName = dptName;
    }

    public String getDptHead() {
        return dptHead;
    }

    public void setDptHead(String dptHead) {
        this.dptHead = dptHead;
    }
}
