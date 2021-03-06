package com.example.jsk.hophacks17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.support.annotation.Nullable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by JSK on 10/22/16.
 */

public class ChooseHouseActivity extends AppCompatActivity {

    private String userName;
    private List<House> houseList;
    private List<Member> members;

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
                houseList = (List<House>) extras.getSerializable("houseList");
            }
        } else {
            userName = savedInstanceState.getString("userName");
            houseList = (List<House>) savedInstanceState.getSerializable("houseList");
        }

        members = new ArrayList<>();
        members.add(new Member("222721a", "jshin49", "2727", 2, 15.20));
        members.add(new Member("213772b", "jchoi100", "2727", 0, 0));
        members.add(new Member("928173x", "jlee381", "2727", 0, 5.50));
        members.add(new Member("771228l", "jkim469", "2727", 0, 0.70));

        final Button button1 = (Button) findViewById(R.id.home1);
        if(houseList.size() >= 1) {
            button1.setText(houseList.get(0).getHouseId());
            System.out.println(houseList.get(0).getHouseId());
        }
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ChooseHouseActivity.this, HouseMainActivity.class);
                intent.putExtra("userName", userName);
                intent.putExtra("HouseID", 4);
                intent.putExtra("members", (Serializable) members);
                startActivity(intent);
                finish();
            }
        });

        final Button button2 = (Button) findViewById(R.id.home2);
        if(houseList.size() >= 2) {
            button2.setText(houseList.get(1).getHouseId());
            System.out.println(houseList.get(1).getHouseId());
        }
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ChooseHouseActivity.this, HouseMainActivity.class);
                intent.putExtra("userName", userName);
                intent.putExtra("HouseID", 4);
                intent.putExtra("members", (Serializable) members);
                startActivity(intent);
                finish();
            }
        });

        final Button button3 = (Button) findViewById(R.id.home3);
        if(houseList.size() >= 3) {
            button3.setText(houseList.get(2).getHouseId());
            System.out.println(houseList.get(2).getHouseId());
        }
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ChooseHouseActivity.this, HouseMainActivity.class);
                intent.putExtra("userName", userName);
                intent.putExtra("HouseID", 4);
                intent.putExtra("members", (Serializable) members);
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



        final Button button4 = (Button) findViewById(R.id.add_house);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ChooseHouseActivity.this, AddHouseActivity.class);
                intent.putExtra("userName", userName);
                intent.putExtra("houseList", (Serializable) houseList);
                intent.putExtra("members", (Serializable) members);
                startActivity(intent);
                finish();
            }
        });

        final Button button5 = (Button) findViewById(R.id.remove_house);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ChooseHouseActivity.this, DeleteHouseActivity.class);
                intent.putExtra("userName", userName);
                intent.putExtra("houseList", (Serializable) houseList);
                intent.putExtra("members", (Serializable) members);
                startActivity(intent);
                finish();
            }
        });

        if (houseList.size() < 1) { //get rid of delete button if no houses
            button5.setVisibility(View.GONE);
            button1.setVisibility(View.GONE);
        }

        if (houseList.size() == 3) { //get rid of add button if 3 houses
            button4.setVisibility(View.GONE);
        }
    }
}
