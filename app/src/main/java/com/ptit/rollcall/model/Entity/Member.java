package com.ptit.rollcall.model.Entity;

import java.util.ArrayList;
import java.util.Calendar;

public class Member {
    private int id;
    private String firstName;
    private String lastName;
    private Calendar dateOfBirth;
    private boolean isMale;

    public Member(int id, String firstName, String lastName, Calendar dateOfBirth, boolean isMale) {
        this.id = id;
        this.firstName = firstName;
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
        return firstName;
    }

    public void setFirtName(String firtName) {
        this.firstName = firtName;
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

    //Create fake data
    public static ArrayList<Member> createMemberList(int numContacts) {
        ArrayList<Member> rs = new ArrayList<Member>();
        int temp = 0;
        Calendar calendar = Calendar.getInstance();
        for (int i = 1; i <= numContacts; i++) {
            rs.add(new Member(++temp, "test first", "test Last", calendar, (i%2) == 0));
        }

        return rs;
    }
}
