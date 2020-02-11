package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDo")
    private TaskList taskListToDo;
    @Autowired
    @Qualifier("inProgress")
    private TaskList taskListInProgress;
    @Autowired
    @Qualifier("doneTask")
    private TaskList taskListDone;

    @Bean
    public Board getBoard() {
        return new Board(taskListToDo, taskListInProgress, taskListDone);
    }

    @Bean(name = "toDo")
    @Scope("prototype")
    public TaskList getToDo() {
        TaskList taskListToDo = new TaskList();
        System.out.println(taskListToDo);
        return taskListToDo;
    }

    @Bean(name = "inProgress")
    @Scope("prototype")
    public TaskList getinProgress() {
        TaskList taskListInProgress = new TaskList();
        System.out.println(taskListInProgress);
        return taskListInProgress;
    }

    @Bean(name = "doneTask")
    @Scope("prototype")
    public TaskList getDoneTask() {
        TaskList taskListDone = new TaskList();
        System.out.println(taskListDone);
        return taskListDone;
    }
}

