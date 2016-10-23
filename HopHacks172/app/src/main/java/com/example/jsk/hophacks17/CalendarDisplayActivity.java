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


public class CalendarDisplayActivity extends AppCompatActivity {

    private int year;
    private int month;
    private int day;
    private int hour;
    private int min;
    private CalendarView calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displaycalendar);

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
                Intent intent = new Intent(CalendarDisplayActivity.this, EventsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                year= 0;
                month= 0;
                day = 0;
                hour = 0;
                min = 0;
            } else {
                year = extras.getInt("year");
                month = extras.getInt("month");
                day = extras.getInt("day");
                hour = extras.getInt("hour");
                min = extras.getInt("min");
            }
        } else {
            year = savedInstanceState.getInt("year");
            month = savedInstanceState.getInt("month");
            day = savedInstanceState.getInt("day");
            hour = savedInstanceState.getInt("hour");
            min = savedInstanceState.getInt("min");
        } //get all info from EventsActivity


    } //end of onCreatee


}

