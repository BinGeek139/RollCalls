package com.ptit.rollcall.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ptit.rollcall.R;
import com.ptit.rollcall.model.Entity.ClassAdapter;
import com.ptit.rollcall.model.Entity.Classs;

import java.util.ArrayList;

public class ActivityCheckin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkin);
        RecyclerView rvCheckin =  findViewById(R.id.rvCheckin);

        ArrayList<Classs> memList = Classs.createClassList(20); // test data

        ClassAdapter adapter = new ClassAdapter(memList);

        rvCheckin.setAdapter(adapter);

        rvCheckin.setLayoutManager(new LinearLayoutManager(this));
    }
}
