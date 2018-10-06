package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Homework hannasHomework = new Homework("Hanna");
        Homework janeksHomework = new Homework("Janek");
        Homework zuziasHomework = new Homework("Zuzia");
        Homework łukaszsHomework = new Homework("Łukasz");
        Homework reginasHomework = new Homework("Regina");
        Homework mariuszsHomework = new Homework("Mariusz");
        Mentor mentorKrzysztof = new Mentor("Krzysztof");
        Mentor mentorWładysław = new Mentor("Władysław");
        hannasHomework.registerObserver(mentorKrzysztof);
        janeksHomework.registerObserver(mentorKrzysztof);
        zuziasHomework.registerObserver(mentorKrzysztof);
        łukaszsHomework.registerObserver(mentorKrzysztof);
        reginasHomework.registerObserver(mentorWładysław);
        mariuszsHomework.registerObserver(mentorWładysław);
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
        //Then
        assertEquals(7, mentorKrzysztof.getUpdateCount());
        assertEquals(6, mentorWładysław.getUpdateCount());

    }
}
