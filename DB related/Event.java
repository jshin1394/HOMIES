package com.example.jeongeunlee.database_home;

/**
 * Event class object to pass User info entity
 *
 */

public class Event {
    public String EID;
    public String memberId;
    public String title;
    public String date;
    
    public Event() {
    } // end of default Event constructor

    public Event(Stirng EID, String memberId, String title, String date) {
        this.EID = EID;
        this.memberId = memberId;
        this.title = title;
        this.date = date;
    } // end of Event constructor

} // end of Event class
