package com.example.jsk.hophacks17;

import java.io.Serializable;

/**
 * Event class object to pass Event info entity
 *
 */

public class Event implements Serializable {
    public String Ename;
    public int Year;
    public int Month;
    public int DoMonth;
    public int hour;
    public int min;
    
    public Event() {
    } // end of default Event constructor

    public Event(String Ename, int Year, int Month, int DoMonth, int hour, int min) {
        this.Ename = Ename;
        this.Year = Year;
        this.Month = Month;
        this.DoMonth = DoMonth;
        this.hour = hour;
        this.min = min;
    } // end of Event constructor



} // end of Event class
