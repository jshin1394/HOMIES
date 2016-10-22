package com.example.jsk.hophacks17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.support.annotation.Nullable;

import java.util.List;


/**
 * Created by JSK on 10/22/16.
 */

public class ChooseHouseActivity extends AppCompatActivity {

    private String userName;
    private List<String> houseList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_house);

        //Get information from login page.
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                userName = null;
                houseList = null;
            } else {
                userName = extras.getString("userName");
                houseList = (List<String>) extras.getSerializable("houseList");
            }
        } else {
            userName = savedInstanceState.getString("userName");
            houseList = (List<String>) savedInstanceState.getSerializable("houseList");
        }

        if (houseList.size() >= 1) {
            final Button button1 = (Button) findViewById(R.id.button2);
            button1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(ChooseHouseActivity.this, HouseMainActivity.class);
                    intent.putExtra("Username", 32);
                    intent.putExtra("HouseID", 1);
                    startActivity(intent);
                    finish();
                }
            });
        }

        if (houseList.size() >= 2) {
            final Button button2 = (Button) findViewById(R.id.button2);
            button2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(ChooseHouseActivity.this, HouseMainActivity.class);
                    intent.putExtra("Username", 32);
                    intent.putExtra("HouseID", 2);
                    startActivity(intent);
                    finish();
                }
            });
        }

        if (houseList.size() >= 3) {
            final Button button3 = (Button) findViewById(R.id.button3);
            button3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(ChooseHouseActivity.this, HouseMainActivity.class);
                    intent.putExtra("Username", 32);
                    intent.putExtra("HouseID", 4);
                    startActivity(intent);
                    finish();
                }
            });
        }

        final Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ChooseHouseActivity.this, AddHouseActivity.class);
                intent.putExtra("Username", 32);
                startActivity(intent);
                finish();
            }
        });

        final Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ChooseHouseActivity.this, DeleteHouseActivity.class);
                intent.putExtra("Username", 32);
                startActivity(intent);
                finish();
            }
        });
    }
}
