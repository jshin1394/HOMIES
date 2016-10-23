package com.example.jsk.hophacks17;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by James on 2016-10-22.
 */

public class MoneyActivity extends AppCompatActivity {

    private String userName;
    private int houseID;
    private List<Member> members;
    private List<Double> amounts;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money);

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

        amounts = new ArrayList<>();
        amounts.add(15.20);
        amounts.add(0.00);
        amounts.add(22.10);
        amounts.add(0.50);

        TextView name1 = (TextView) findViewById(R.id.textView1);
        TextView name2 = (TextView) findViewById(R.id.textView2);
        TextView name3 = (TextView) findViewById(R.id.textView3);
        TextView name4 = (TextView) findViewById(R.id.textView4);

        name1.setText(members.get(0).username);
        name2.setText(members.get(1).username);
        name3.setText(members.get(2).username);
        name4.setText(members.get(3).username);

        TextView value1 = (TextView) findViewById(R.id.textView11);
        TextView value2 = (TextView) findViewById(R.id.textView21);
        TextView value3 = (TextView) findViewById(R.id.textView31);
        TextView value4 = (TextView) findViewById(R.id.textView41);

        value1.setText(amounts.get(0).toString());
        value2.setText(amounts.get(1).toString());
        value3.setText(amounts.get(2).toString());
        value4.setText(amounts.get(3).toString());
    }
}