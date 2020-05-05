package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentsHomework implements Observable {
    private List<String> tasks;
    private List<StudentsMentor> mentors;
    private String studentsName;

    public StudentsHomework(String studentsName) {
        tasks = new ArrayList<>();
        mentors = new ArrayList<>();
        this.studentsName = studentsName;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyStudentsMentor();
    }

    @Override
    public void registerStudentsMentor(StudentsMentor studentsMentor) {
        mentors.add(studentsMentor);
    }

    @Override
    public void notifyStudentsMentor() {
        for (StudentsMentor studentsMentor : mentors) {
            studentsMentor.update(this);
        }
    }
    public void removeStudentsMentor(StudentsMentor studentsMentor) {
        mentors.remove(studentsMentor);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public List<StudentsMentor> getMentors() {
        return mentors;
    }

    public String getStudentsName() {
        return studentsName;
    }
}
