package com.engeto.lekce3;
public class Main {

    public static void main(String[] args) {

        String Fizz = "Fizz";
        String Buzz = "Buzz";
        String FizzBuzz = "FizzBuzz";

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(FizzBuzz);
            } else if (i % 3 == 0) {
                System.out.println(Fizz);
            } else if (i % 5 == 0) {
                System.out.println(Buzz);
            } else {
                System.out.println(i);
            }


        }
    }
}