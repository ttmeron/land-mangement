package com.aaca.LandMangement.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public  class  LandOwner implements Comparable<LandOwner> {
    private Integer ownerId;
    private String fName,lName;

    public LandOwner(int ownerId, String fName, String lName) {
        this.ownerId = ownerId;
        this.fName = fName;
        this.lName = lName;
    }

    public String toString() {
        return this.ownerId +" "+ this.fName +"" + this.lName;
    }

    @Override
    public int compareTo(LandOwner l) {
        return this.fName .compareTo(l.fName);
//               return Integer.compare(this.ownerId, o);


    }
}
