package com.kodilla.good.patterns.challenges.movie;

import java.util.stream.Collectors;

public class MainMovieStore {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        String titles = movieStore.getMovies().entrySet().stream()
                .flatMap(titlesAndTranslations -> titlesAndTranslations.getValue().stream())
                .collect(Collectors.joining("! "));

        System.out.println(titles);

    }
}
