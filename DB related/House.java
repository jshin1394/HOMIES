package com.example.jeongeunlee.database_home;

/**
 * House class object to pass House info entity
 */

public class House {
    public String HouseId;
    private String street;
    private String city;
    private int zip;
    private int number;

    public House(){
        //default constructor
    }

    public House(String HouseID, String street, String city, int zip, int num){
        this.HouseId = HouseID;
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.number = num;
    }
}
