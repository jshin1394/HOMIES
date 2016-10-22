package com.example.jsk.hophacks17;

/**
 * House class object to pass House info entity
 */

public class House {
    public String houseId;
    private String address;
    private int numMembers;

    public House(){
    } // end of default House constructor

    public House(String houseID, String address, int numMembers){
        this.houseId = houseId;
        this.address = address;
        this.numMembers = numMembers;
    } // end of House constructor

    public String getHouseId() {
        return this.houseId;
    }

    public String getAddress() {
        return this.address;
    }

    public int getNumMembers() {
        return this.numMembers;
    }
} // end of House class