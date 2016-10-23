package com.example.jsk.hophacks17;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by James on 2016-10-22.
 */

public class MoneyActivity extends AppCompatActivity {

    private String userName;
    private int houseID;
    private List<Member> members;

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


        TextView name1 = (TextView) findViewById(R.id.textView1);
        TextView name2 = (TextView) findViewById(R.id.textView2);
        TextView name3 = (TextView) findViewById(R.id.textView3);
        TextView name4 = (TextView) findViewById(R.id.textView4);

        name1.setText(members.get(0).username);
        name2.setText(members.get(1).username);
        name3.setText(members.get(2).username);
        name4.setText(members.get(3).username);

        System.out.println(members.get(0).username);
        System.out.println(members.get(1).username);
        System.out.println(members.get(2).username);
        System.out.println(members.get(3).username);


        TextView value1 = (TextView) findViewById(R.id.textView11);
        TextView value2 = (TextView) findViewById(R.id.textView21);
        TextView value3 = (TextView) findViewById(R.id.textView31);
        TextView value4 = (TextView) findViewById(R.id.textView41);

        value1.setText(Double.toString(members.get(0).amount));
        value2.setText(Double.toString(members.get(1).amount));
        value3.setText(Double.toString(members.get(2).amount));
        value4.setText(Double.toString(members.get(3).amount));

        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MoneyActivity.this, EditMoneyActivity.class);
                intent.putExtra("userName", userName);
                intent.putExtra("houseID", houseID);
                intent.putExtra("members", (Serializable) members);
                intent.putExtra("index", 0);
                startActivity(intent);
                finish();
            }
        });

        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MoneyActivity.this, EditMoneyActivity.class);
                intent.putExtra("userName", userName);
                intent.putExtra("houseID", houseID);
                intent.putExtra("members", (Serializable) members);
                intent.putExtra("index", 1);
                startActivity(intent);
                finish();
            }
        });

        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MoneyActivity.this, EditMoneyActivity.class);
                intent.putExtra("userName", userName);
                intent.putExtra("houseID", houseID);
                intent.putExtra("members", (Serializable) members);
                intent.putExtra("index", 2);
                startActivity(intent);
                finish();
            }
        });

        final Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MoneyActivity.this, EditMoneyActivity.class);
                intent.putExtra("userName", userName);
                intent.putExtra("houseID", houseID);
                intent.putExtra("members", (Serializable) members);
                intent.putExtra("index", 3);
                startActivity(intent);
                finish();
            }
        });

        if (!members.get(0).username.equals(userName)) {
            button1.setVisibility(View.GONE);
        }

        if (!members.get(1).username.equals(userName)) {
            button2.setVisibility(View.GONE);
        }

        if (!members.get(2).username.equals(userName)) {
            button3.setVisibility(View.GONE);
        }

        if (!members.get(3).username.equals(userName)) {
            button4.setVisibility(View.GONE);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(MoneyActivity.this, HouseMainActivity.class);
        intent.putExtra("userName", userName);
        intent.putExtra("houseID", houseID);
        intent.putExtra("members", (Serializable) members);
        startActivity(intent);
        finish();
    }
}