package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testTaskShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTaskActivity(TaskFactory.SHOPPING);
        System.out.println(task.isTaskExecuted());
        //Then
        Assert.assertEquals("Spring shopping", task.getTaskName());
    }

    @Test
    public void testTaskPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTaskActivity(TaskFactory.PAINTING);
        System.out.println(task.isTaskExecuted());
        //Then
        Assert.assertEquals("After party renovation", task.getTaskName());
    }

    @Test
    public void testTaskDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTaskActivity(TaskFactory.DRIVING);
        System.out.println(task.isTaskExecuted());
        //Then
        Assert.assertEquals("Summer journey", task.getTaskName());
    }
}
