package com.orinovel.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.orinovel.myapplication.util.preferencesHelper;

public class splashActivity extends AppCompatActivity {
    preferencesHelper instance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        instance = preferencesHelper.getInstance(getApplicationContext());
        int splashInterval = 10;
        new Handler().postDelayed(() -> {
            if (listance.isLogin)) {
                startActivity(new Intent(splashActivity.this, LoginActivity.class));
            } else {
                startActivity(new Intent(splashActivity.this, MainActivity.class));
            }
        }, splashInterval);
    }
}
