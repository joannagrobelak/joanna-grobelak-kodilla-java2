package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void testPublicationYearMedian() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        books.add(new Book ("Vladimir Nabokov", "Pnin", 1953, "1234"));
        books.add(new Book ("Ernest Hemingway", "For Whom The Bell Tolls", 1973, "5678"));
        books.add(new Book ("Salman Rushdie", "The Satanic Verses", 1988, "9101"));
        books.add(new Book ("Oriana Fallaci", "Un cappello pieno di ciliege", 2008, "1121"));
        books.add(new Book ("Kristina Sabaliauskaitė", "Silva Rerum", 2015, "3141"));
        //When
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        assertEquals(1988, median);
    }
}
