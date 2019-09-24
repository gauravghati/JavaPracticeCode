package com.example.hp.ecommercestore.splashActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.hp.ecommercestore.LoginPage.SigninActivity;
import com.example.hp.ecommercestore.R;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        init();
    }
    public void init(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                    Intent intent = new Intent(SplashActivity.this, SigninActivity.class);
                    startActivity(intent);
            }
        },5000);
    }
}
