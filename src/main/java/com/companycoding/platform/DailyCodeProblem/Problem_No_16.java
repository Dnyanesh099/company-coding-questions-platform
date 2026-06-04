package com.companycoding.platform.DailyCodeProblem;

import java.util.Arrays;
import java.util.List;

//Count the number of occurrences of a given String.
public class Problem_No_16 {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("java scala ruby", "java react spring java");

        String word="java";

        long Count = strings.stream().flatMap(s -> Arrays.stream(s.split(" "))).filter(s -> s.equals(word)).count();
        System.out.println(Count);
    }
}
