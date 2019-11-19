package com.ptit.rollcall.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ptit.rollcall.R;
import com.ptit.rollcall.model.Entity.ClassAdapter;
import com.ptit.rollcall.model.Entity.Classs;

import java.util.ArrayList;

public class ActivityClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);

        RecyclerView rvClass =  findViewById(R.id.rvClass);

        ArrayList<Classs> memList = Classs.createClassList(20); // test data

        ClassAdapter adapter = new ClassAdapter(memList);

        rvClass.setAdapter(adapter);

        rvClass.setLayoutManager(new LinearLayoutManager(this));
    }
}
