package com.example.jsk.hophacks17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Member class object to pass Member info entity
 *
 */

public class Member implements Serializable {
    public String memberId;
    public String username;
    public String houseId;
    public int status;
    public double amount;
    public List<Integer> chores;

    public Member() {
    } // end of default Member constructor

    public Member(String memberId, String username, String houseId, int status, double amount) {
        this.memberId = memberId;
        this.username = username;
        this.houseId = houseId;
        this.status = status;
        this.amount = amount;
        chores = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            chores.add(0);
        }
    } // end of Member constructor

} // end of Member class
