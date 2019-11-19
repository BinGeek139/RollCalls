package com.ptit.rollcall.model.Entity;

import java.util.ArrayList;
import java.util.Calendar;


public class Member {
    private int id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;

    public Member(int id, String firstName, String lastName, String dateOfBirth, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String gender() {
        return gender;
    }

    public void setMale(String male) {
        gender = male;
    }

    //Create fake data
    public static ArrayList<Member> createMemberList(int numContacts) {
        ArrayList<Member> rs = new ArrayList<Member>();
        int temp = 0;
        String string = Calendar.getInstance().toString();
        for (int i = 1; i <= numContacts; i++) {
            rs.add(new Member(++temp, "test first", "test Last", string,(i%2)==0 ?"male":"female" ) );
        }

        return rs;
    }
}
