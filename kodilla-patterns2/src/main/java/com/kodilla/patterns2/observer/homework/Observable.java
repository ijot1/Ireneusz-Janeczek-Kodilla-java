package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

public interface Observable {
    void registerStudentsMentor(StudentsMentor studentsMentor);
    void notifyStudentsMentor();
    void removeStudentsMentor(StudentsMentor studentsMentor);
}
