package com.example.jsk.hophacks17;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by JeongeunLee on 10/23/16.
 */

public class EventListActivity extends AppCompatActivity {

    private int year;
    private int month;
    private int day;
    private int hour;
    private int min;
    private ArrayList<Event> events;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventlist);

        // Attach an listener to read the data at our posts reference
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                events = null;
            } else {
                events = (ArrayList<Event>) extras.getSerializable("events");
            }
        } else {
            events = (ArrayList<Event>) savedInstanceState.getSerializable("events");
        } //get all info from EventsActivity

        display();
    }

    public void display(){
        final TextView textview1 = (TextView) findViewById(R.id.ctv1);
        final TextView textview2 = (TextView) findViewById(R.id.ctv2);
        final TextView textview3 = (TextView) findViewById(R.id.ctv3);
        final TextView textview4 = (TextView) findViewById(R.id.ctv4);
        final TextView textview5 = (TextView) findViewById(R.id.ctv5);
        if(events.size() == 0) {
            textview1.setVisibility(View.GONE);
            textview2.setVisibility(View.GONE);
            textview3.setVisibility(View.GONE);
            textview4.setVisibility(View.GONE);
            textview5.setVisibility(View.GONE);
        }
        if(events.size() == 1){
            textview1.setText(events.get(0).Ename + " " + events.get(0).Year + "/" + events.get(0).Month + "/" +
                    events.get(0).DoMonth + "/" + events.get(0).hour + "/" + events.get(0).min);
            textview2.setVisibility(View.GONE);
            textview3.setVisibility(View.GONE);
            textview4.setVisibility(View.GONE);
            textview5.setVisibility(View.GONE);
        }

        if(events.size() == 2){
            textview1.setText(events.get(0).Ename + " " + events.get(0).Year + "/" + events.get(0).Month + "/" +
                    events.get(0).DoMonth + "/" + events.get(0).hour + "/" + events.get(0).min);
            textview2.setText(events.get(1).Ename + " " + events.get(1).Year + "/" + events.get(1).Month + "/" +
                    events.get(1).DoMonth + "/" + events.get(1).hour + "/" + events.get(1).min);
            textview3.setVisibility(View.GONE);
            textview4.setVisibility(View.GONE);
            textview5.setVisibility(View.GONE);
        }
        if(events.size() == 3){
            textview1.setText(events.get(0).Ename + " " + events.get(0).Year + "/" + events.get(0).Month + "/" +
                    events.get(0).DoMonth + "/" + events.get(0).hour + "/" + events.get(0).min);
            textview2.setText(events.get(1).Ename + " " + events.get(1).Year + "/" + events.get(1).Month + "/" +
                    events.get(1).DoMonth + "/" + events.get(1).hour + "/" + events.get(1).min);
            textview3.setText(events.get(2).Ename + " " + events.get(2).Year + "/" + events.get(2).Month + "/" +
                    events.get(2).DoMonth + "/" + events.get(2).hour + "/" + events.get(2).min);
            textview4.setVisibility(View.GONE);
            textview5.setVisibility(View.GONE);
        }

        if(events.size() == 4){
            textview1.setText(events.get(0).Ename + " " + events.get(0).Year + "/" + events.get(0).Month + "/" +
                    events.get(0).DoMonth + "/" + events.get(0).hour + "/" + events.get(0).min);
            textview2.setText(events.get(1).Ename + " " + events.get(1).Year + "/" + events.get(1).Month + "/" +
                    events.get(1).DoMonth + "/" + events.get(1).hour + "/" + events.get(1).min);
            textview3.setText(events.get(2).Ename + " " + events.get(2).Year + "/" + events.get(2).Month + "/" +
                    events.get(2).DoMonth + "/" + events.get(2).hour + "/" + events.get(2).min);
            textview4.setText(events.get(3).Ename + " " + events.get(3).Year + "/" + events.get(3).Month + "/" +
                    events.get(3).DoMonth + "/" + events.get(3).hour + "/" + events.get(3).min);
            textview5.setVisibility(View.GONE);
        }

        if(events.size() == 5){
            textview1.setText(events.get(0).Ename + " " + events.get(0).Year + "/" + events.get(0).Month + "/" +
                    events.get(0).DoMonth + "/" + events.get(0).hour + "/" + events.get(0).min);
            textview2.setText(events.get(1).Ename + " " + events.get(1).Year + "/" + events.get(1).Month + "/" +
                    events.get(1).DoMonth + "/" + events.get(1).hour + "/" + events.get(1).min);
            textview3.setText(events.get(2).Ename + " " + events.get(2).Year + "/" + events.get(2).Month + "/" +
                    events.get(2).DoMonth + "/" + events.get(2).hour + "/" + events.get(2).min);
            textview4.setText(events.get(3).Ename + " " + events.get(3).Year + "/" + events.get(3).Month + "/" +
                    events.get(3).DoMonth + "/" + events.get(3).hour + "/" + events.get(3).min);
            textview5.setText(events.get(4).Ename + " " + events.get(4).Year + "/" + events.get(4).Month + "/" +
                    events.get(4).DoMonth + "/" + events.get(4).hour + "/" + events.get(4).min);

        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(EventListActivity.this, CalendarDisplayActivity.class);
        intent.putExtra("events", (Serializable)events );
        startActivity(intent);
        finish();
    }
}
