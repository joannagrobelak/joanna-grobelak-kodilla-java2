package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Homework homework) {
        System.out.println(mentorName + ": new taks sent by " + homework.getStudentName() +
                " (total tasks from this student: " + homework.getTasks().size() + ")");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
