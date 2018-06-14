package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator(6,4);

        int result2 = calculator.add(6, 4);
        int result3 = calculator.subtract(6,4);
        int valueA = calculator.getA();
        int valueB = calculator.getB();

        if(result2 == valueA + valueB) {
            System.out.println("test ok!");
        } else {
            System.out.println("error!");
        }

        if(result3 == valueA - valueB) {
            System.out.println("test ok!");
        } else {
            System.out.println("error!");
        }

    }
}
