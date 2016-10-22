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
import java.util.List;

/**
 * Created by JSK on 10/22/16.
 */



public class DeleteHouseActivity extends AppCompatActivity {

    private String userName;
    private List<House> houseList = new ArrayList<>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_house);

        //Get information from login page.
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                userName = null;
                houseList = null;
            } else {
                userName = extras.getString("userName");
                houseList = (List<House>) extras.getSerializable("houseList");
            }
        } else {
            userName = savedInstanceState.getString("userName");
            houseList = (List<House>) savedInstanceState.getSerializable("houseList");
        }

        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                houseList.remove(0);
                Intent intent = new Intent(DeleteHouseActivity.this, ChooseHouseActivity.class);
                //Delete the first house from houseList of the user
                //update houseList of the user
                intent.putExtra("Username", 32);
                intent.putExtra("houseList", (Serializable) houseList);
                startActivity(intent);
                finish();
            }
        });

        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                houseList.remove(1);
                Intent intent = new Intent(DeleteHouseActivity.this, ChooseHouseActivity.class);
                //Delete the first house from houseList of the user
                //update houseList of the user
                intent.putExtra("Username", 32);
                intent.putExtra("houseList", (Serializable) houseList);
                startActivity(intent);
                finish();
            }
        });

        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                houseList.remove(2);
                Intent intent = new Intent(DeleteHouseActivity.this, ChooseHouseActivity.class);
                //Delete the first house from houseList of the user
                //update houseList of the user
                intent.putExtra("username", 32);
                intent.putExtra("houseList", (Serializable) houseList);
                //update house list with this gone
                startActivity(intent);
                finish();
            }
        });

        if (houseList.size() < 3) {
            button3.setVisibility(View.GONE);
        }

        if (houseList.size() < 2) {
            button2.setVisibility(View.GONE);
        }

    }
}