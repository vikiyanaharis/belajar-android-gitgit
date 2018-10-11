package com.orinovel.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.orinovel.myapplication.util.PreferencesHelper;

public class splashActivity extends AppCompatActivity {


    PreferencesHelper intances;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        intances = PreferencesHelper.getInstance(getApplicationContext());
        int splashInterval = 10;
        new Handler () .postDelayed(new Runnable() {
            @Override
            public void run() {
                if (!intances.isLogin()) {
                    startActivity(new Intent(splashActivity.this, LoginActivity.class));
                } else {
                    startActivity(new Intent(splashActivity.this, MainActivity.class));
                }
            }
        }, splashInterval);
    }
}

