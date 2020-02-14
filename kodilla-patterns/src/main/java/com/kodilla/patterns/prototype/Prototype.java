package com.kodilla.patterns.prototype;


public class Prototype<T> implements Cloneable {
    @Override
    public Board clone() throws CloneNotSupportedException {
        return (Board) super.clone();
    }
}

