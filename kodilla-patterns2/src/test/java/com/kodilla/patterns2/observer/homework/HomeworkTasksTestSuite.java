package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTasksTestSuite {

    @Test
    public void testUpdateBasicCase() {
        //Given
        HomeworkTasks hannasHomework = new HomeworkTasks("Hanna");
        HomeworkTasks janeksHomework = new HomeworkTasks("Janek");
        HomeworkTasks mariuszsHomework = new HomeworkTasks("Mariusz");
        Mentor mentorKrzysztof = new Mentor("Krzysztof");
        Mentor mentorWładysław = new Mentor("Władysław");
        Mentor mentorEdward = new Mentor("Edward");
        hannasHomework.registerObserver(mentorKrzysztof);
        janeksHomework.registerObserver(mentorKrzysztof);
        mariuszsHomework.registerObserver(mentorWładysław);
        //When
        hannasHomework.addTask("task 1");
        hannasHomework.addTask("task 2");
        hannasHomework.addTask("task 3");
        janeksHomework.addTask("task 1");
        mariuszsHomework.addTask("task 1");
        mariuszsHomework.addTask("task 2");
        //Then
        assertEquals(4, mentorKrzysztof.getUpdateCount());
        assertEquals(2, mentorWładysław.getUpdateCount());
        assertEquals(0, mentorEdward.getUpdateCount());

    }

    @Test
    public void testUpdateCaseTwoMentorsOneStudent() {
        //Given
        HomeworkTasks janeksHomework = new HomeworkTasks("Janek");
        Mentor mentorKrzysztof = new Mentor("Krzysztof");
        Mentor mentorEdward = new Mentor("Edward");
        janeksHomework.registerObserver(mentorKrzysztof);
        janeksHomework.registerObserver(mentorEdward);
        //When
        janeksHomework.addTask("task 1");
        janeksHomework.addTask("task 2");
        //Then
        assertEquals(2, mentorKrzysztof.getUpdateCount());
        assertEquals(2, mentorEdward.getUpdateCount());

    }

    @Test
    public void testUpdateCaseMentorRemoved() {
        //Given
        HomeworkTasks janeksHomework = new HomeworkTasks("Janek");
        Mentor mentorKrzysztof = new Mentor("Krzysztof");
        Mentor mentorEdward = new Mentor("Edward");
        janeksHomework.registerObserver(mentorKrzysztof);
        janeksHomework.removeObserver(mentorEdward);
        //When
        janeksHomework.addTask("task 1");
        janeksHomework.removeObserver(mentorEdward);
        janeksHomework.addTask("task 2");
        //Then
        assertEquals(2, mentorKrzysztof.getUpdateCount());
        assertEquals(0, mentorEdward.getUpdateCount());

    }
}
