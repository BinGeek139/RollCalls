package com.ptit.rollcall.model.Entity;

import java.util.ArrayList;
import java.util.Calendar;

public class Classs {
    private int id;
    private String name;
    private String timeStart;
    private String timeEnd;

    public Classs(int id, String name, String timeStart, String timeEnd) {
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

    //Create fake data
    public static ArrayList<Classs> createClassList(int numContacts) {
        ArrayList<Classs> rs = new ArrayList<Classs>();
        int temp = 0;
        String string= Calendar.getInstance().toString();
        for (int i = 1; i <= numContacts; i++) {
            rs.add(new Classs(++temp, "test", string, string));
        }

        return rs;
    }
}
