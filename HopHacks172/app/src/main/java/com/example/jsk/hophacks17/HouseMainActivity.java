package com.example.jsk.hophacks17;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JSK on 10/22/16.
 */

public class HouseMainActivity extends AppCompatActivity {

    private String userName;
    private int houseID;
    private List<Member> members;
    private List<Double> amounts;

    //assume we have member list for a house

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_main);

        //Get information from login page.
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                userName = null;
                houseID = 0;
                amounts = null;
            } else {
                userName = extras.getString("userName");
                houseID = extras.getInt("houseID");
                amounts = (List<Double>) extras.getSerializable("amounts");
            }
        } else {
            userName = savedInstanceState.getString("userName");
            houseID = savedInstanceState.getInt("houseID");
            amounts = (List<Double>) savedInstanceState.getSerializable("amounts");
        }



        final Button moneyButton = (Button) findViewById(R.id.money_button);
        moneyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HouseMainActivity.this, MoneyActivity.class);
                intent.putExtra("userName", "jkim469");
                intent.putExtra("houseID", houseID);
                intent.putExtra("members", (Serializable) members);
                intent.putExtra("amounts", (Serializable) amounts);
                startActivity(intent);
                finish();
            }
        });

        final Button choreButton = (Button) findViewById(R.id.chore_button);
        choreButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HouseMainActivity.this, HousekeepingActivity.class);
                intent.putExtra("userName", "jkim469");
                intent.putExtra("houseID", houseID);
                intent.putExtra("members", (Serializable) members);
                intent.putExtra("amounts", (Serializable) amounts);
                startActivity(intent);
                finish();
            }
        });

        final Button stateButton = (Button) findViewById(R.id.state_button);
        stateButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HouseMainActivity.this, StateActivity.class);
                intent.putExtra("userName", 32);
                intent.putExtra("houseID", houseID);
                intent.putExtra("members", (Serializable) members);
                startActivity(intent);
                finish();
            }
        });

    }
}
