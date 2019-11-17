package com.ptit.rollcall.model.Entity;

import java.util.Calendar;

public class Classs {
    private int id;
    private String name;
    private Calendar timeStart;
    private Calendar timeEnd;

    public Classs(int id, String name, Calendar timeStart, Calendar timeEnd) {
        this.id = id;
        this.name = name;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
