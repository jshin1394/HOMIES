package com.example.jsk.hophacks17;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by JSK on 10/22/16.
 */



public class AddHouseActivity extends AppCompatActivity { 

    private List<House> houseList = new ArrayList<>();

    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_add_house);  
        final EditText house_name = (EditText) findViewById(R.id.house_name); 
        final EditText house_address = (EditText) findViewById(R.id.house_address);  
        ArrayList<House> houseList = new ArrayList<House>();  
        // Attach an listener to read the data at our posts reference 
        final Button button = (Button) findViewById(R.id.login); 
        button.setOnClickListener(new View.OnClickListener() { 
            public void onClick(View v) {  
                final String house_name_field = house_name.getText().toString(); 
                final String house_address_field = house_address.getText().toString();  
                // houseList.add("123"); 
                // houseList.add("456");  
                Intent intent = new Intent(AddHouseActivity.this, ChooseHouseActivity.class); 
                intent.putExtra("userName", "abc"); 
                intent.putExtra("houseList", (Serializable) houseList); 
                startActivity(intent); 
                finish(); 
            } 
        });  
    }
 } 
