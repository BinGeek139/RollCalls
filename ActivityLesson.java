package com.ptit.rollcall.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ptit.rollcall.R;
import com.ptit.rollcall.model.Entity.Lesson;
import com.ptit.rollcall.model.Entity.LessonAdapter;
import com.ptit.rollcall.model.Entity.Member;
import com.ptit.rollcall.model.Entity.MemberAdapter;

import java.util.ArrayList;

public class ActivityLesson extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
        RecyclerView rvLesson =  findViewById(R.id.rvLesson);

        ArrayList<Lesson> memList = Lesson.createLessonList(20); // test data

        LessonAdapter adapter = new LessonAdapter(memList);

        rvLesson.setAdapter(adapter);

        rvLesson.setLayoutManager(new LinearLayoutManager(this));
    }
}
