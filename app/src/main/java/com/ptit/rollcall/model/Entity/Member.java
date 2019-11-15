package com.ptit.rollcall.model.Entity;

import java.util.Calendar;

public class Member {
    private int id;
    private String firtName;
    private String lastName;
    private Calendar dateOfBirth;
    private boolean isMale;

    public Member(int id, String firtName, String lastName, Calendar dateOfBirth, boolean isMale) {
        this.id = id;
        this.firtName = firtName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.isMale = isMale;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirtName() {
        return firtName;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}
