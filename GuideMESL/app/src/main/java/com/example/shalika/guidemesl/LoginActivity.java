package com.example.shalika.guidemesl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText usernameEt, passwordEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usernameEt = (EditText) findViewById(R.id.username);
        passwordEt = (EditText) findViewById(R.id.password);

    }
    public void onLogin(View view){
        String username = usernameEt.getText().toString();
        String password = passwordEt.getText().toString();
        String type = "login";

        LoginHandler loginHandler = new LoginHandler(this);
        loginHandler.execute(type, username, password);
        //Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        //startActivity(intent);
        //finish();
        //return;

    }
}

