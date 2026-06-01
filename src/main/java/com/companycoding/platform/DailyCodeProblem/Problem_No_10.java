package com.companycoding.platform.DailyCodeProblem;

/* Streams 10: List of the questions on filter (For Practice)
   1. Find out all the even numbers that exist in the list using Stream functions
   2. Find out the FIRST even number that exists in the list using Stream functions
   3. Java 8 program to perform cube on list elements and filter numbers greater than 50
*/

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Problem_No_10 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(24,5,10,15,8,49,25,98,32);
        //list.stream().filter(i->i%2==0).forEach(System.out::println);

       // Optional<Integer> first = list.stream().filter(i -> i % 2 == 0).findFirst();
       // first.ifPresent(System.out::println);

        list.stream().map(i->i*i*i).filter(i->i>50).forEach(System.out::println);
    }
}