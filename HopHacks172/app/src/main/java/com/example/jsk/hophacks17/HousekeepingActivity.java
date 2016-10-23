package com.example.jsk.hophacks17;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by James on 2016-10-22.
 */
public class HousekeepingActivity extends AppCompatActivity {
    private String userName;
    private int houseID;
    private List<Member> members;
    private List<Double> amounts;
    //    private List<Housekeeping> chores;
    private int[][] chores;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_housekeeping);

        //Get information from login page.
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                userName = null;
                houseID = 0;
                members = null;
                amounts = null;
            } else {
                userName = extras.getString("userName");
                houseID = extras.getInt("houseID");
                members = (List<Member>) extras.getSerializable("members");
                amounts = (List<Double>) extras.getSerializable("amounts");
            }
        } else {
            userName = savedInstanceState.getString("userName");
            houseID = savedInstanceState.getInt("houseID");
            members = (List<Member>) savedInstanceState.getSerializable("members");
            amounts = (List<Double>) savedInstanceState.getSerializable("amounts");
        }

        TextView name1 = (TextView) findViewById(R.id.textView1);
        TextView name2 = (TextView) findViewById(R.id.textView2);
        TextView name3 = (TextView) findViewById(R.id.textView3);
        TextView name4 = (TextView) findViewById(R.id.textView4);

        name1.setText(members.get(0).username);
        name2.setText(members.get(1).username);
        name3.setText(members.get(2).username);
        name4.setText(members.get(3).username);

        chores = new int[4][3];
        chores[0][0] = 4;
        chores[0][1] = 3;
        chores[0][2] = 2;
        chores[1][0] = 1;
        chores[1][1] = 5;
        chores[1][2] = 7;
        chores[2][0] = 2;
        chores[2][1] = 7;
        chores[2][2] = 2;
        chores[3][0] = 9;
        chores[3][1] = 12;
        chores[3][2] = 0;

//        chores[0] = {4,3,2};
//        chores[1] = {1,5,7};
//        chores[2] = {2,7,2};
//        chores[3] = {9,12,0};


        final TextView value11 = (TextView) findViewById(R.id.textView11);
        final TextView value12 = (TextView) findViewById(R.id.textView12);
        final TextView value13 = (TextView) findViewById(R.id.textView13);
        final TextView value21 = (TextView) findViewById(R.id.textView21);
        final TextView value22 = (TextView) findViewById(R.id.textView22);
        final TextView value23 = (TextView) findViewById(R.id.textView23);
        final TextView value31 = (TextView) findViewById(R.id.textView31);
        final TextView value32 = (TextView) findViewById(R.id.textView32);
        final TextView value33 = (TextView) findViewById(R.id.textView33);
        final TextView value41 = (TextView) findViewById(R.id.textView41);
        final TextView value42 = (TextView) findViewById(R.id.textView42);
        final TextView value43 = (TextView) findViewById(R.id.textView43);

        List<TextView> member1 = new ArrayList<TextView>();
        List<TextView> member2 = new ArrayList<TextView>();
        List<TextView> member3 = new ArrayList<TextView>();
        List<TextView> member4 = new ArrayList<TextView>();

        final List<List<TextView>> garaDatabase = (List) new ArrayList<ArrayList<TextView>>();

        member1.add(value11);
        member1.add(value12);
        member1.add(value13);

        member2.add(value21);
        member2.add(value22);
        member2.add(value23);

        member3.add(value31);
        member3.add(value32);
        member3.add(value33);

        member4.add(value41);
        member4.add(value42);
        member4.add(value43);

        garaDatabase.add(member1);
        garaDatabase.add(member2);
        garaDatabase.add(member3);
        garaDatabase.add(member4);

        System.out.println(garaDatabase.get(1).get(2));

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                garaDatabase.get(i).get(j).setText(Integer.toString(chores[i][j]));
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                garaDatabase.get(i).get(j).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        TextView text = (TextView) view;
                        text.setText(Integer.toString(Integer.parseInt(text.getText().toString()) + 1));
                    }
                });
            }
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(HousekeepingActivity.this, HouseMainActivity.class);
        intent.putExtra("userName", "jkim469");
        intent.putExtra("houseID", houseID);
        intent.putExtra("members", (Serializable) members);
        intent.putExtra("amounts", (Serializable) amounts);
        startActivity(intent);
        finish();
    }

} // end of HouseKeepingActivity class
