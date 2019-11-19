package com.ptit.rollcall.model.Entity;

import java.util.Calendar;

public class Lesson {
    private int id;
    private Calendar timeStart;
    private Calendar timeEnd;
    private Classs aClass;

    public Lesson(int id, Calendar timeStart, Calendar timeEnd, Classs aClass) {
        this.id = id;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.aClass = aClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Calendar timeStart) {
        this.timeStart = timeStart;
    }

    public Calendar getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Calendar timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Classs getaClass() {
        return aClass;
    }

    public void setaClass(Classs aClass) {
        this.aClass = aClass;
    }
}
