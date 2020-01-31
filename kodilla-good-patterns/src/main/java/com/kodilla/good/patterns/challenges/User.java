package com.kodilla.good.patterns.challenges;

public class User {
    public String Name;
    public String surname;

    public User(String name, String surname) {
        Name = name;
        this.surname = surname;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return surname;
    }
}
