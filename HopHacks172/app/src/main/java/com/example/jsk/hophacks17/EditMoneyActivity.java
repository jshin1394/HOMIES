package com.example.jsk.hophacks17;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.Serializable;
import java.util.List;

/**
 * Created by James on 2016-10-22.
 */

public class EditMoneyActivity extends AppCompatActivity {

    private String userName;
    private int houseID;
    private List<Member> members;
    private List<Double> amounts;
    private int index;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_money);

        //Get information from login page.
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                userName = null;
                houseID = 0;
                members = null;
                amounts = null;
                index = -1;
            } else {
                userName = extras.getString("userName");
                houseID = extras.getInt("houseID");
                members = (List<Member>) extras.getSerializable("members");
                amounts = (List<Double>) extras.getSerializable("amounts");
                index = extras.getInt("index");
            }
        } else {
            userName = savedInstanceState.getString("userName");
            houseID = savedInstanceState.getInt("houseID");
            members = (List<Member>) savedInstanceState.getSerializable("members");
            amounts = (List<Double>) savedInstanceState.getSerializable("amounts");
            index = savedInstanceState.getInt("index");
        }

        TextView text = (TextView) findViewById(R.id.textView1);
        text.setText(userName);

        final EditText edit = (EditText) findViewById(R.id.editText1);

        final Button editButton = (Button) findViewById(R.id.edit_button);
        editButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Double change = Double.parseDouble(edit.getText().toString());
                amounts.set(index, amounts.get(index) + change);
                Intent intent = new Intent(EditMoneyActivity.this, MoneyActivity.class);
                intent.putExtra("userName", userName);
                intent.putExtra("houseID", houseID);
                intent.putExtra("members", (Serializable) members);
                intent.putExtra("amounts", (Serializable) amounts);
                startActivity(intent);
                finish();
            }
        });

    }




}
