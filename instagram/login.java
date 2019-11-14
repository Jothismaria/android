package com.example.instagram;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {
    private EditText email;
    private EditText Password;
    private EditText info;
    private Button Login;
    private int counter = 5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        email = (EditText)findViewById(R.id.email);
        Password =  (EditText)findViewById(R.id.password);
        Login = (Button) findViewById(R.id.btn_login);
        info.setText("No of attempts remaining: 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(email.getText().toString(),Password.getText().toString());
            }
        });
    }
    private void validate(String email, String password){
        if((email =="mail2jothismaria@gmail.com")&&(password == "1234")){
            Intent intent = new Intent(login.this, MainActivity.class);
            startActivity(intent);
        }else{
            counter--;
            info.setText("No of attempts remaining:"+ String.valueOf(counter));
            if(counter == 0){
                Login.setEnabled(false);
            }
        }
    }
}
