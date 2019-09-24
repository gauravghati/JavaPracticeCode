package com.example.hp.ecommercestore.LoginPage;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.hp.ecommercestore.HomeScreen.HomeActivity;
import com.example.hp.ecommercestore.R;

public class SigninActivity extends AppCompatActivity {
    private EditText Email;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        Email = (EditText)findViewById(R.id.edtEmail);
        password = (EditText)findViewById(R.id.edtPassword);
        login = (Button) findViewById(R.id.btn1);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valid();
            }
        });

    }

    private void valid() {
        String userEmail = Email.getText().toString();
        String userPassword = password.getText().toString();
        if(userEmail.equals("gauravghati225@gmail.com") && userPassword.equals("1234")) {
            Intent intent = new Intent(SigninActivity.this, HomeActivity.class);
            startActivity(intent);
        } else{
            Intent intent =  new Intent(SigninActivity.this,loginFail.class);
            startActivity(intent);
        }
    }

}
