package com.example.jsk.hophacks17;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

/**
 * Created by James on 2016-10-22.
 */

public class StateActivity extends AppCompatActivity {

    private String userName;
    private int houseID;
    private List<Member> members;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);

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

    }
}