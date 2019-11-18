package com.ptit.rollcall.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ptit.rollcall.R;
import com.ptit.rollcall.model.Entity.Member;

import java.util.ArrayList;

public class ActivityMember extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.member_view);

        RecyclerView rvMember = (RecyclerView) findViewById(R.id.rvMember);

        ArrayList<Member> memList = Member.createMemberList(20);

        MemberAdapter adapter = new MemberAdapter(memList);

        rvMember.setAdapter(adapter);

        rvMember.setLayoutManager(new LinearLayoutManager(this));
    }
}
