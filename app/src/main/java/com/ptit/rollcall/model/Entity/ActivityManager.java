package com.ptit.rollcall.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ptit.rollcall.R;

public class ActivityManager extends AppCompatActivity {
    public static final int TEXT_REQUEST_MEM = 1;
    public static final int TEXT_REQUEST_CLASS = 1;
    public static final int TEXT_REQUEST_LES = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);
    }

    public void launchMember(View view) {
        Intent intent = new Intent(this, ActivityMember.class);
        startActivityForResult(intent, TEXT_REQUEST_MEM);
    }

    public void launchClass(View view) {
        Intent intent = new Intent(this, ActivityClass.class);
        startActivityForResult(intent, TEXT_REQUEST_CLASS);
    }

    public void launchLesson(View view) {
        Intent intent = new Intent(this, ActivityLesson.class);
        startActivityForResult(intent, TEXT_REQUEST_LES);
    }
}
