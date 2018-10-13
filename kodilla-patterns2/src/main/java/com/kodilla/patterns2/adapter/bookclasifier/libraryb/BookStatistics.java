package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.util.Map;

public interface BookStatistics {

    int averagePublicationYear(Map<BookSignature, Book> books);
    int medianPubliationYear(Map<BookSignature, Book> books);
}
