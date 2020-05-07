package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testpublicationYearMedian() {
        //Given
        Set<Book> books = new HashSet<>();
        Book book1 = new Book("Core Java", "Cay Horstmann, Gary Cornell", 2008, "ISBN-13: 123-4-5678-9012-1");
        Book book2 = new Book("Journey to the Center of the Earth", "Jules Verne", 1975, "ISBN-13: 123-4-5678-9012-2");
        Book book3 = new Book("C++ Primer Plus", "Stephen Prata", 2006, "ISBN-13: 123-4-5678-9012-3");
        Book book4 = new Book("The Jungle Book", "Rudyard Kipling", 1958, "ISBN-13: 123-4-5678-9012-4");
        Book book5 = new Book("Learning UML 2.0", "Russ Miles, Kim Hamilton", 2006, "ISBN-13: 123-4-5678-9012-5");
        Book book6 = new Book("Test-Driven Java Development", "Viktor Farcic, Alex Garcia", 2015, "ISBN-13: 123-4-5678-9012-6");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int medianYear = medianAdapter.publicationYearMedian(books);
        //Then
        Assert.assertEquals(medianYear, 2006);
    }

}
