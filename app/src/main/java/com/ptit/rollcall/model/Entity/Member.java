package com.ptit.rollcall.model.Entity;



public class Member {
    private int id;
    private String firtName;
    private String lastName;
    private String dateOfBirth;
    private String gender;

    public Member(int id, String firtName, String lastName, String dateOfBirth, String gender) {
        this.id = id;
        this.firtName = firtName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender   = gender;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String gender() {
        return gender;
    }

    public void setGender(String male) {
        gender = male;
    }
}
