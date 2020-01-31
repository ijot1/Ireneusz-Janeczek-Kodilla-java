package com.kodilla.good.patterns.challenges;

public class User {
    public String name;
    public String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
