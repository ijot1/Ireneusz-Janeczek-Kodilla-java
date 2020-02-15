package com.kodilla.patterns.prototype;


import com.kodilla.patterns.prototype.library.Library;

public class Prototype<T> implements Cloneable {
    @Override
    public Library clone() throws CloneNotSupportedException {
        return (Library) super.clone();
    }
}

