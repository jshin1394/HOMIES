package com.example.jsk.hophacks17;

import com.google.firebase.*;

/**
 * Created by JeongeunLee on 10/22/16.
 */

public class Upload_data {
    private DatabaseReference mDatabase;
    mDatabase = FirebaseDatabase.getInstance().getReference();
    //FirebaseApp data = FirebaseApp.getInstance();

    public void NewUser(String username, String email, String fname, String lname,String DOB ) {
        User user = new User(username, email, fname, lname, DOB);
        mDatabase.child("users").child(username).setValue(user);
    }

    public void NewEvent(String EID, String MemberId, String Title, int Date) {
        Event event = new Event(username, email, fname, lname, DOB);
        mDatabase.child("event").child(EID).setValue(event);
    }

    public void NewMember(String MemberId, String Username, String HouseID, String status){
        Member m = new Member(MemberId, Username, String HouseID, String status);
        mDatabase.child("member").child(MemberId).setValue(m);
    }

    public void NewHouse(String houseId, String street, String city, int zip, int num){
        House h = new House(houseId, street, city, zip, num);
        mDatabase.child("house").child(HouseId).setValue(h);
    }

    public void NewFinance(String FID, String memberID, String type, int date, int amount){
        Finance f = new Finance(FID, memberID, type, date, amount));
        mDatabase.child("finance").child(FID).setValue(f);
    }

    public void NewHousekeeping(String HKID, String memberID, String type, String comment, String date){
        Housekeeping hk = new Housekeeping(HKID, memberID, type, comment, date)
        mDatabase.child("housekeeping").child(HKID).setValue(hk);
    }

}
