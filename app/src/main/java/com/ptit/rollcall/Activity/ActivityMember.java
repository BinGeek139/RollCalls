package com.ptit.rollcall.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ptit.rollcall.R;
import com.ptit.rollcall.model.Entity.Member;
import com.ptit.rollcall.model.Entity.MemberAdapter;

import java.util.ArrayList;

public class ActivityMember extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.member_view);

        RecyclerView rvMember =  findViewById(R.id.rvMember);

        ArrayList<Member> memList = Member.createMemberList(20); // test data

        MemberAdapter adapter = new MemberAdapter(memList);

        rvMember.setAdapter(adapter);

        rvMember.setLayoutManager(new LinearLayoutManager(this));
    }
}
