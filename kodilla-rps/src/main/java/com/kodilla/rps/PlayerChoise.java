package com.kodilla.rps;

public enum PlayerChoise {

    ROCK(1),
    PAPPER(2),
    SCISSORS(3);

    int value;

    PlayerChoise(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
