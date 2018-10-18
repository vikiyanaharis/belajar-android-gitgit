package com.orinovel.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.orinovel.myapplication.util.PreferencesHelper;

public class LoginActivity extends AppCompatActivity {
    PreferencesHelper instance;
    private EditText nama;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        instance = PreferencesHelper.getInstance(getApplicationContext());
        nama = (EditText) findViewById(R.id.text1);
        password = (EditText) findViewById(R.id.text2);
    }

    public void Login(View view) {
        String n = nama.getText().toString();
        String p = password.getText().toString();
        Toast.makeText(getApplicationContext(),"Berhasil Login",Toast.LENGTH_SHORT).show();
        instance.setLogin(true);
        instance.setName(n);


        if (n != null && p != ""){
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);


            Bundle bundle_login = new Bundle();

            bundle_login.putString("nama", n);
            intent.putExtras(bundle_login);
            startActivity(intent);
            finish();
        }
        else {
            Toast.makeText(getApplicationContext(),"Isikan Nama Dan Password",Toast.LENGTH_SHORT).show();

        }

    }
}
