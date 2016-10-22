package com.example.jsk.hophacks17;

/**
 * Event class object to pass Event info entity
 *
 */

public class Event {
    public String EID;
    public String memberId;
    public String title;
    public String date;
    
    public Event() {
    } // end of default Event constructor

    public Event(String EID, String memberId, String title, String date) {
        this.EID = EID;
        this.memberId = memberId;
        this.title = title;
        this.date = date;
    } // end of Event constructor

} // end of Event class
