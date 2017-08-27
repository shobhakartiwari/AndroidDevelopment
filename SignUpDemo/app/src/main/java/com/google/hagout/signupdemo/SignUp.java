package com.google.hagout.signupdemo;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        final Button button = (Button) findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                System.out.println("on clicked");
                //Toast.makeText(getApplicationContext(), "Please enter Username", Toast.LENGTH_LONG).show();
                Intent nextScreen = new Intent(SignUp.this, activity_home.class);
                startActivity(nextScreen);
            }
        });
    }
}
