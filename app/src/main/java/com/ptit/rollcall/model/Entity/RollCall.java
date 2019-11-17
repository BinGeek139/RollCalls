package com.ptit.rollcall.model.Entity;

public class RollCall {
    private int id;
    private Member member;
    private  Lesson lesson;

    public RollCall(int id, Member member, Lesson lesson) {
        this.id = id;
        this.member = member;
        this.lesson = lesson;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
}
