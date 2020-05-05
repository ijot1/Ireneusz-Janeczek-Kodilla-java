package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentsMentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        StudentsMentor mentorAndy = new StudentsMentor("Andy");
        StudentsMentor mentorMatt = new StudentsMentor("Matt");

        StudentsHomework hwCarlo = new StudentsHomework("Carlo");
        StudentsHomework hwHenry = new StudentsHomework("Henry");
        StudentsHomework hwJosh = new StudentsHomework("Josh");
        StudentsHomework hwMelinda = new StudentsHomework("Melinda");
        StudentsHomework hwMaria = new StudentsHomework("Maria");

        hwCarlo.registerStudentsMentor(mentorAndy);
        hwHenry.registerStudentsMentor(mentorMatt);
        hwJosh.registerStudentsMentor(mentorAndy);
        hwMelinda.registerStudentsMentor(mentorAndy);
        hwMaria.registerStudentsMentor(mentorMatt);
        //When
        hwCarlo.addTask("Decorator pattern");
        hwHenry.addTask("Adapter pattern");
        hwJosh.addTask("Observer pattern");
        hwMelinda.addTask("Facade pattern");
        hwMaria.addTask("Builder pattern");

        hwCarlo.addTask("Adapter pattern");
        hwHenry.addTask("Observer pattern");
        hwJosh.addTask("Facade pattern");
        hwMelinda.addTask("Builder pattern");
        hwMaria.addTask("Decorator pattern");

        hwCarlo.addTask("Observer pattern");
        hwHenry.addTask("Facade pattern");
        hwJosh.addTask("Builder pattern");
        hwMelinda.addTask("Decorator pattern");
        hwMaria.addTask("Adapter pattern");
        //Then
        assertEquals(9, mentorAndy.getUpdateCount());
        assertEquals(6, mentorMatt.getUpdateCount());
    }
}
