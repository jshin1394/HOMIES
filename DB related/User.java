package com.example.jeongeunlee.database_home;

/**
 * User class object to pass User info entity
 *
 */

public class User {
    public String username;
    public String email;
    private String fname;
    private String lname;
    private String DOB;

    public User() {
            // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String email, String fname, String lname, String DOB) {
        this.username = username;
        this.email = email;
        this.fname = fname;
        this.lname = lname;
        this.DOB = DOB;
    }
}
