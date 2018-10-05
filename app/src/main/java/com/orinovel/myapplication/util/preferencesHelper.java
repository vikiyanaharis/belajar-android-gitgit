package com.orinovel.myapplication.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by amikom on 28/09/2018.
 */

public class preferencesHelper {
    private static preferencesHelper INSTANCE;
    private SharedPreferences sharedPreferences;

    private preferencesHelper(Context context){
        SharedPreferences = context
                .getApplicationContext()
                .getSharedPreferences("simple.android.app", Context.MODE_PRIVATE);
    }

    public static  preferencesHelper getInstace(Context context){
        if (INSTANCE == null){
            INSTANCE = new preferencesHelper(context);
        }
        return INSTANCE;
    }

    public SharedPreferences pref(){
        return SharedPreferences;
    }

    public Boolean isLogin(){
        return SharedPreferences.getBoolean("isLogin", false);
    }

    public void setLogin(Boolean isCall){
        sharedPreferences.edit().putBoolean("isLogin", isCall).apply();
    }

    public void setName(String isName){
        sharedPreferences.edit().putString("isName", isName).apply();
    }

    public String getName (){
        return sharedPreferences.getString("isName", "");
    }
}
