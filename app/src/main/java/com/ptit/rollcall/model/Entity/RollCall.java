package com.ptit.rollcall.model.Entity;

public class RollCall {
    private Member member;
    private  Lesson lesson;

    public RollCall(Member member, Lesson lesson) {
        this.member = member;
        this.lesson = lesson;
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
