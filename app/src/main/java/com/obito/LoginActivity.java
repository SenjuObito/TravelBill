package com.obito;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText;

    private Button loginButton;

    private void findComponents(){
        usernameEditText= findViewById(R.id.usernameTextView);
        loginButton= findViewById(R.id.loginButton);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findComponents();
    }
    
}
