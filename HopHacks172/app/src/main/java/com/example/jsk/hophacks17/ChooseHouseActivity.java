package com.example.jsk.hophacks17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;


/**
 * Created by JSK on 10/22/16.
 */

public class ChooseHouseActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4; //add house
    Button button5; //remove house

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Attach an listener to read the data at our posts reference
        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ChooseHouseActivity.this, HouseMainActivity.class);
                intent.putExtra("Username",32);
                intent.putExtra("HouseID",32);
                startActivity(intent);
                finish();
            });
        }

        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ChooseHouseActivity.this, HouseMainActivity.class);
                intent.putExtra("Username",32);
                intent.putExtra("HouseID",32);
                startActivity(intent);
                finish();
            });
        }

        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ChooseHouseActivity.this, HouseMainActivity.class);
                intent.putExtra("Username",32);
                intent.putExtra("HouseID",32);
                startActivity(intent);
                finish();
            });
        }
        final Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ChooseHouseActivity.this, AddHouseActivity.class);
                intent.putExtra("Username",32);
                startActivity(intent);
                finish();
            });
        }
        final Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ChooseHouseActivity.this, DeleteHouseActivity.class);
                intent.putExtra("Username",32);
                intent.putExtra("HouseID",32);
                startActivity(intent);
                finish();
            });
        }
    }



}
