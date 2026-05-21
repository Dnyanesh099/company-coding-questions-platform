/*
    Program: Method Overloading Example

    Description:
    Create a Java program using Method Overloading where:

    1. One method adds a double and a String
    2. One method adds two double values
    3. One method adds two String values

    Concepts Used:
    - Method Overloading
    - Compile-time Polymorphism
    - String Concatenation
    - Decimal Formatting

    Author: Dnyanesh Patil
*/
package com.companycoding.platform.Accenture;
import java.text.DecimalFormat;

public class AdditionMagicRound2 {

    public static void main(String[] args) {

        AdditionMagicRound2 obj = new AdditionMagicRound2();

        // double + String
        System.out.println("double + String : " + obj.add(10.0, "Java"));

        // double + double
        System.out.println("double + double : " + obj.add(10.25, 20.75));

        // String + String
        System.out.println("String + String : " + obj.add("Hello ", "World"));
    }

    // double + String
    public String add(double a, String b) {

        if (a == (int) a) {
            return String.valueOf((int) a) + b;
        }

        return String.valueOf(a) + b;
    }

    // double + double
    public String add(double a, double b) {

        DecimalFormat df = new DecimalFormat("0.0#");

        return df.format(a + b);
    }

    // String + String
    public String add(String a, String b) {

        return a + b;
    }
}