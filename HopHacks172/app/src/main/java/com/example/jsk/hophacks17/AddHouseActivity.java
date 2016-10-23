package com.example.jsk.hophacks17;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AddHouseActivity extends AppCompatActivity {

    private String userName;
    private List<House> houseList;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_house);

        final EditText house_name_field = (EditText) findViewById(R.id.house_name);
        final EditText house_address_field = (EditText) findViewById(R.id.house_address);

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

        // Attach an listener to read the data at our posts reference 
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                final String houseName = house_name_field.getText().toString();
                final String houseAddress = house_address_field.getText().toString();

                houseList.add(new House(houseName, houseAddress, 1));
                //search house, and add with the housenamefield and houseaddressfield.
                //modify the houselist accordingly, and the putextra will send correct dat to choosehouseactivity.

                // houseList.add("123"); 
                // houseList.add("456");  
                Intent intent = new Intent(AddHouseActivity.this, ChooseHouseActivity.class);
                intent.putExtra("userName", userName);
                intent.putExtra("houseList", (Serializable) houseList);
                startActivity(intent);
                finish();
            }
        });
    }
 }
