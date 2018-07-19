package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //given
        Library library = new Library("MyBooks");
        library.getBooks().add(new Book("Pnin", "Vladimir Nabokov", LocalDate.of(1953, 1, 1)));
        library.getBooks().add(new Book("For Whom The Bell Tolls", "Ernest Hemingway", LocalDate.of(1973,2, 2)));
        library.getBooks().add(new Book("The Satanic Verses", "Salman Rushdie", LocalDate.of(1988, 3, 3)));
        library.getBooks().add(new Book("Un capello pieno di ciliege", "Oriana Fallaci", LocalDate.of(2008, 4, 4)));
        library.getBooks().add(new Book("Silva Rerum", "Kristina Sabaliauskaitė", LocalDate.of(2015, 5, 5)));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("MyBooks2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("MyBooks3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when
        library.getBooks().add(new Book("Pale Fire", "Vladimir Nabokov", LocalDate.of(1953, 1, 1)));

        //then
        System.out.println(library.getBooks() + "\n");
        System.out.println(clonedLibrary.getBooks() + "\n");
        System.out.println(deepClonedLibrary.getBooks() + "\n");
        Assert.assertEquals(6, library.getBooks().size());
        Assert.assertEquals(6, clonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(), clonedLibrary.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
