package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("understand Git");
        board.getInProgressList().getTasks().add("write a working test");
        board.getDoneList().getTasks().add("make the project work again...");
        //Then
        System.out.println("Tasks on my list: \n" + board.getToDoList().getTasks().get(0) + ", " +
                board.getInProgressList().getTasks().get(0) + ", " + board.getDoneList().getTasks().get(0) + ".");

    }
}
