package com.ptit.rollcall.Activity.model;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.ptit.rollcall.R;

import com.ptit.rollcall.model.Entity.ClassAdapter;
import com.ptit.rollcall.model.Entity.Classs;
import com.ptit.rollcall.model.Entity.Member;
import com.ptit.rollcall.model.Entity.MemberAdapter;
import com.ptit.rollcall.model.dao.DatabaseAccess;

import java.util.ArrayList;

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

        // Test recycleView
//        RecyclerView rvMember = (RecyclerView) findViewById(R.id.rvMember);
//
//        ArrayList<Member> memList = Member.createMemberList(20);
//
//        MemberAdapter adapter = new MemberAdapter(memList);
//
//        rvMember.setAdapter(adapter);
//
//        rvMember.setLayoutManager(new LinearLayoutManager(this));
    }
}
