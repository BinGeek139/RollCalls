package com.ptit.rollcall.Activity.model;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.ptit.rollcall.R;

import com.ptit.rollcall.model.dao.DatabaseAccess;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();
        Log.e("tag","ok");
        Log.e("infor", "onCreate: "+  databaseAccess.getMember());
        databaseAccess.close();
    }
}
