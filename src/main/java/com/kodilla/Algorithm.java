package com.kodilla;

class Algorithm {

    public static int algorithm(int a, int b) {

        while(a != b) {
            if(a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        return b;
    }

    public static void main (String[] args) {

        System.out.println(algorithm(12, 36));

    }
}
