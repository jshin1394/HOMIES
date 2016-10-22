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

public class LoginActivity extends AppCompatActivity {

    private DatabaseReference reference = FirebaseDatabase.getInstance().getReference();

    private List<String> houseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        final EditText login_email_field = (EditText) findViewById(R.id.id);
        final EditText login_password_field = (EditText) findViewById(R.id.pw);

        houseList = new ArrayList<>();

        // Attach an listener to read the data at our posts reference
        final Button button = (Button) findViewById(R.id.login);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                final String login_email = login_email_field.getText().toString();
                final String login_password = login_password_field.getText().toString();

                houseList.add("123"); //
                houseList.add("456");

                Intent intent = new Intent(LoginActivity.this, ChooseHouseActivity.class);
                intent.putExtra("userName", "abc");
                intent.putExtra("houseList", (Serializable) houseList);
                startActivity(intent);
                finish();
            }
        });

    }

}

