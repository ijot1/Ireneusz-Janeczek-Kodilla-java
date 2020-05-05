package com.kodilla.patterns2.observer.homework;

public class StudentsMentor implements Observer {
    private String mentorsName;
    private int updateCount;

    public StudentsMentor(String mentorsName) {
        this.mentorsName = mentorsName;
    }

    @Override
    public void update(StudentsHomework studentsHomework) {
        System.out.println(mentorsName + ": New task made by" + studentsHomework.getStudentsName() + "\n" +
                "   (total: " + studentsHomework.getTasks().size() + " tasks)");
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
