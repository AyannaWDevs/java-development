package com.pluralsight.calculator;

import java.util.Scanner;

//class declaration
public class AddIntegers {
    public static void main(String[] args) {
        int firstInt, secondInt, sum;
        Scanner input = new Scanner(System.in);
        // get first and second input
        System.out.println("I will take two numbers and add them");
        System.out.println("Please enter the first number");
        firstInt = input.nextInt();
        System.out.println("Please enter the second number");
        secondInt = input.nextInt();
        //calculate the sum
        sum = firstInt + secondInt;
        //displays the sum
        System.out.println("The sum of " + firstInt + " and " + secondInt + " is: " + sum);
    }
}
