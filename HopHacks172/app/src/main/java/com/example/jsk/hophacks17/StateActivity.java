package com.example.jsk.hophacks17;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by James on 2016-10-22.
 */

public class StateActivity extends AppCompatActivity {

    private String userName;
    private int houseID;
    private List<Member> members;

    List<RadioGroup> radioGroup;

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

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText(members.get(0).username);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(members.get(1).username);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText(members.get(2).username);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setText(members.get(3).username);


        radioGroup = new ArrayList<>();
        radioGroup.add((RadioGroup) findViewById(R.id.radio_group1));
        radioGroup.add((RadioGroup) findViewById(R.id.radio_group2));
        radioGroup.add((RadioGroup) findViewById(R.id.radio_group3));
        radioGroup.add((RadioGroup) findViewById(R.id.radio_group4));

        RadioButton statusButton;
        int[][] ids = new int[4][3];
        ids[0][0] = R.id.home1;
        ids[0][1] = R.id.away1;
        ids[0][2] = R.id.busy1;
        ids[1][0] = R.id.home2;
        ids[1][1] = R.id.away2;
        ids[1][2] = R.id.busy2;
        ids[2][0] = R.id.home3;
        ids[2][1] = R.id.away3;
        ids[2][2] = R.id.busy3;
        ids[3][0] = R.id.home4;
        ids[3][1] = R.id.away4;
        ids[3][2] = R.id.busy4;

        for (int i = 0; i < radioGroup.size(); i++) {
            statusButton = (RadioButton) findViewById(ids[i][members.get(i).status]);
            statusButton.setChecked(true);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        for (int i = 0; i < radioGroup.size(); i++) {
            int selectedID = radioGroup.get(i).getCheckedRadioButtonId();
            RadioButton radioButton = (RadioButton) findViewById(selectedID);
            final String stateString = radioButton.getText().toString();
            int state = -1;
            switch (stateString) {
                case "Home":
                    state = 0;
                    break;
                case "Away":
                    state = 1;
                    break;
                case "Busy":
                    state = 2;
                    break;
            }
            members.get(i).status = state;
        }

        Intent intent = new Intent(StateActivity.this, HouseMainActivity.class);
        intent.putExtra("userName", userName);
        intent.putExtra("houseID", houseID);
        intent.putExtra("members", (Serializable) members);
        startActivity(intent);
        finish();
    }
}
