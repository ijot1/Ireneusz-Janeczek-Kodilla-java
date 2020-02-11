package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testBoardToDo() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().toString();
        //Then
        Assert.assertEquals("[]", board.getToDoList().getTasks().toString());
    }

    @Test
    public void testBoardInProgress() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getInProgressList().getTasks();
        //Then
        Assert.assertEquals("[]", board.getInProgressList().getTasks().toString());
    }

    @Test
    public void testBoardDoneTasks() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getDoneList().getTasks();
        //Then
        Assert.assertEquals("[]", board.getDoneList().getTasks().toString());
    }

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("TASK toDo nr 1");
        //Then
        Assert.assertSame("TASK toDo nr 1", board.getToDoList().getTasks().get(0));
    }

    @Test
    public void testTaskAdd1() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getInProgressList().getTasks().add("TASK inProgress nr 1");
        //Then
        Assert.assertSame("TASK inProgress nr 1", board.getInProgressList().getTasks().get(0));
    }

    @Test
    public void testTaskAdd2() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getDoneList().getTasks().add("TASK done nr 1");
        //Then
        Assert.assertSame("TASK done nr 1", board.getDoneList().getTasks().get(0));
    }
}
