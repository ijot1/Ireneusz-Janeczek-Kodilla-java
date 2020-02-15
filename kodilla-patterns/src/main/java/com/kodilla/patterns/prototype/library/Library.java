package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        List<Book> litsOfBooks = new ArrayList<>(books);
        String s = "Library [" + name + "]";
        for (int i = 0; i < litsOfBooks.size(); i++) {
            s = s + "\n" + "     " + litsOfBooks.get(i).toString();
        }
        return s;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book theBook : books) {
            clonedLibrary.getBooks().addAll(books);
        }
        return clonedLibrary;
    }
}
