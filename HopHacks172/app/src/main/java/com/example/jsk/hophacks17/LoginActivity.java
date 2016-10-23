package com.example.jsk.hophacks17;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {

 //   private DatabaseReference reference = FirebaseDatabase.getInstance().getReference();

    private List<House> houseList;

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

                final String login_id = login_email_field.getText().toString();
                final String login_password = login_password_field.getText().toString();

                //dummy login verification
                if(!login_id.equals("jkim469") || !login_id.equals("jshin49") ||
                        !login_id.equals("jchoi100") || !login_id.equals("jlee381") ||
                        !login_password.equals("1234")) {
                    Toast.makeText(LoginActivity.this, "Wrong account info", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(LoginActivity.this, ChooseHouseActivity.class);
                    intent.putExtra("userName", login_id);
                    //dummy house to dummy user
                    intent.putExtra("houseList", (Serializable) houseList);
                    startActivity(intent);
                    finish();
                }
            }
        });

        // Attach an listener to read the data at our posts reference
        final Button button2 = (Button) findViewById(R.id.register);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

}

