package com.example.jsk.hophacks17;

/**
 * User class object to pass User info entity
 *
 */

public class User {
    //public String username;
    public String email;
    public String fname;
    public String lname;
    public String DOB;
    public String password;

    public User() {
    } // end of default User constructor

    public User(String email, String fname, String lname, String DOB, String password) {
        //this.username = username;
        this.email = email;
        this.fname = fname;
        this.lname = lname;
        this.DOB = DOB;
        this.password = password;
    } // end of User constructor

} // end of User class
