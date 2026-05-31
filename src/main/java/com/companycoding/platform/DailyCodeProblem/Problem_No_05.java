package com.companycoding.platform.DailyCodeProblem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Streams 5: Find Max Number in a list
public class Problem_No_05 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 4, 41, 4);

        int maxNo=numbers.stream().max(Comparator.naturalOrder()).orElse(0);
        System.out.println(maxNo);

    }
}
