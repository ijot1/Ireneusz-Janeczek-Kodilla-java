package com.kodilla.patterns.prototype;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testToString() {
        //Given
        Book book1 = new Book("Core Java", "Cay Horstmann, Gary Cornell", LocalDate.of(2008, 1, 1));
        Book book2 = new Book("Journey to the Center of the Earth", "Jules Verne", LocalDate.of(1975, 1, 1 ));
        Book book3 = new Book("C++ Primer Plus", "Stephen Prata", LocalDate.of(2006,1,1));
        Book book4 = new Book("The Jungle Book", "Rudyard Kipling", LocalDate.of(1958,1,1));
        Book book5 = new Book("Learning UML 2.0", "Russ Miles, Kim Hamilton", LocalDate.of(2006,1,1));
        Book book6 = new Book("Test-Driven Java Development", "Viktor Farcic, Alex Garcia", LocalDate.of(2015,1,1));
        Book book7 = new Book("Spring in Action", "Craig Walls", LocalDate.of(2019,1,1));

        Library library = new Library("basic library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);
        library.getBooks().add(book6);
        library.getBooks().add(book7);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("cloned library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("deep cloned library");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);
        library.getBooks().remove(book2);
        library.getBooks().remove(book3);
        library.getBooks().remove(book4);
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(7, deepClonedLibrary.getBooks().size());
    }
}
