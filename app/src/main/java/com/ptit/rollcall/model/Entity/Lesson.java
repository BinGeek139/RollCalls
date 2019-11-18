package com.ptit.rollcall.model.Entity;



public class Lesson {
    private int id;
    private String timeStart;
    private String timeEnd;
    private Classs aClass;

    public Lesson(int id, String timeStart, String timeEnd, Classs aClass) {
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

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Classs getaClass() {
        return aClass;
    }

    public void setaClass(Classs aClass) {
        this.aClass = aClass;
    }
}
