package com.companycoding.platform.DailyCodeProblem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Sort in descending order
public class Problem_No_04 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(11, 11, 1, 3, 5, 6, 5);

        List<Integer> result=list.stream().distinct().sorted(Comparator.reverseOrder()).toList();
        System.out.println(result);

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        List<String> resultStrings=listOfStrings.stream().distinct().sorted(Comparator.comparing(String::length)).toList();
        System.out.println(resultStrings);
    }
}
