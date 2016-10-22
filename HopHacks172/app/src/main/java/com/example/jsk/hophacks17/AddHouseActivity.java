package com.example.jsk.hophacks17;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

/**
 * Created by JSK on 10/22/16.
 */

public class AddHouseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        //Gets the information passed on by the previous activity.
        Intent intent = getIntent();
        index = intent.getIntExtra("index", -1);
        userId = intent.getStringExtra("userId");
        site = (Site) intent.getSerializableExtra("selectedSite");
    }

}
