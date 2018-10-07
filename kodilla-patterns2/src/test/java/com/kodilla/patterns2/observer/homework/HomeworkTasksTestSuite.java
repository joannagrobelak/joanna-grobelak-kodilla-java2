package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTasksTestSuite {

    @Test
    public void testUpdate() {
        //Given
        HomeworkTasks hannasHomework = new HomeworkTasks("Hanna");
        HomeworkTasks janeksHomework = new HomeworkTasks("Janek");
        HomeworkTasks zuziasHomework = new HomeworkTasks("Zuzia");
        HomeworkTasks łukaszsHomework = new HomeworkTasks("Łukasz");
        HomeworkTasks reginasHomework = new HomeworkTasks("Regina");
        HomeworkTasks mariuszsHomework = new HomeworkTasks("Mariusz");
        Mentor mentorKrzysztof = new Mentor("Krzysztof");
        Mentor mentorWładysław = new Mentor("Władysław");
        Mentor mentorEdward = new Mentor("Edward");
        hannasHomework.registerObserver(mentorKrzysztof);
        janeksHomework.registerObserver(mentorKrzysztof);
        janeksHomework.removeObserver(mentorEdward);
        zuziasHomework.registerObserver(mentorKrzysztof);
        łukaszsHomework.registerObserver(mentorKrzysztof);
        reginasHomework.registerObserver(mentorWładysław);
        mariuszsHomework.registerObserver(mentorWładysław);
        mariuszsHomework.registerObserver(mentorKrzysztof);
        //When
        hannasHomework.addTask("task 1");
        hannasHomework.addTask("task 2");
        hannasHomework.addTask("task 3");
        janeksHomework.addTask("task 1");
        zuziasHomework.addTask("task 1");
        łukaszsHomework.addTask("task 1");
        łukaszsHomework.addTask("task 2");
        reginasHomework.addTask("task 1");
        reginasHomework.addTask("task 2");
        reginasHomework.addTask("task 3");
        reginasHomework.addTask("task 4");
        mariuszsHomework.addTask("task 1");
        mariuszsHomework.addTask("task 2");
        janeksHomework.removeObserver(mentorEdward);
        janeksHomework.addTask("task2");
        //Then
        assertEquals(10, mentorKrzysztof.getUpdateCount());
        assertEquals(6, mentorWładysław.getUpdateCount());
        assertEquals(0, mentorEdward.getUpdateCount());

    }
}
