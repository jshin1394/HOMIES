package com.example.jsk.hophacks17;

import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class CalendarDisplayActivity extends AppCompatActivity {

    private int year;
    private int month;
    private int day;
    private int hour;
    private int min;
    private String event;
    private String userName;
    private int houseID;
    private List<Member> members;
    private CalendarView calendar;

    private int userindex;

    public void getunserindex(){
        if (members.get(0).username.equals(userName)) {
            userindex = 0;
        }

        if (members.get(1).username.equals(userName)) {
            userindex = 1;
        }

        if (members.get(2).username.equals(userName)) {
            userindex = 2;
        }

        if (members.get(3).username.equals(userName)) {
            userindex = 3;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displaycalendar);

        //Get information from login page.
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                userName = null;
                houseID = 0;
                members = null;
            } else {
                userName = extras.getString("userName");
                houseID = extras.getInt("houseID");
                members = (List<Member>) extras.getSerializable("members");
            }
        } else {
            userName = savedInstanceState.getString("userName");
            houseID = savedInstanceState.getInt("houseID");
            members = (List<Member>) savedInstanceState.getSerializable("members");
        }

        calendar = (CalendarView) findViewById(R.id.calendar);
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int day) {
                Toast.makeText(getApplicationContext(), day + "/" + month + "/" + year + "/",
                        Toast.LENGTH_LONG).show();
            }
        });

        // Attach an listener to read the data at our posts reference
        final Button button_c = (Button) findViewById(R.id.button_cal);
        button_c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(members.get(userindex).events.size() == 5){
                    Toast.makeText(CalendarDisplayActivity.this, "Maximum number of events reached", Toast.LENGTH_LONG).show();
                }else {
                    Intent intent = new Intent(CalendarDisplayActivity.this, EventsActivity.class);
                    intent.putExtra("userName", userName);
                    intent.putExtra("houseID", houseID);
                    intent.putExtra("members", (Serializable) members);
                    startActivity(intent);
                    finish();
                }
            }
        });

        final Button button_v = (Button) findViewById(R.id.button_view);
        button_v.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CalendarDisplayActivity.this, EventListActivity.class);
                intent.putExtra("userName", userName);
                intent.putExtra("houseID", houseID);
                intent.putExtra("members", (Serializable) members);
                intent.putExtra("index", userindex);
                startActivity(intent);
                finish();
            }
        });

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                year = 0;
                month = 0;
                day = 0;
                hour = 0;
                min = 0;
                event = null;
            } else {
                year = extras.getInt("year");
                month = extras.getInt("month");
                day = extras.getInt("day");
                hour = extras.getInt("hour");
                min = extras.getInt("min");
                event = extras.getString("event");
                if(event != null) {
                    addEvent();
                }
            }
        } else {
            year = savedInstanceState.getInt("year");
            month = savedInstanceState.getInt("month");
            day = savedInstanceState.getInt("day");
            hour = savedInstanceState.getInt("hour");
            min = savedInstanceState.getInt("min");
            //addEvent();
        } //get all info from EventsActivity
    } //end of onCreatee

    public void addEvent(){
        Event e = new Event(event, year, month, day, hour, min);
        members.get(userindex).events.add(e);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(CalendarDisplayActivity.this, HouseMainActivity.class);
        intent.putExtra("userName", userName);
        intent.putExtra("houseID", houseID);
        intent.putExtra("members", (Serializable) members);
        startActivity(intent);
        finish();
    }



}

