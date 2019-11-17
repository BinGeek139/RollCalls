package com.ptit.rollcall.model.Entity;

import java.util.ArrayList;
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

    //Create fake data
    public static ArrayList<Classs> createClassList(int numContacts) {
        ArrayList<Classs> rs = new ArrayList<Classs>();
        int temp = 0;
        Calendar calendar = Calendar.getInstance();
        for (int i = 1; i <= numContacts; i++) {
            rs.add(new Classs(++temp, "test", calendar, calendar));
        }

        return rs;
    }
}
