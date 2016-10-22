package com.example.jsk.hophacks17;

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
    } // end of default User constructor

    public User(String username, String email, String fname, String lname, String DOB) {
        this.username = username;
        this.email = email;
        this.fname = fname;
        this.lname = lname;
        this.DOB = DOB;
    } // end of User constructor

} // end of User class
