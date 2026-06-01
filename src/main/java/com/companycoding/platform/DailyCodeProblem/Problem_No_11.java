package com.companycoding.platform.DailyCodeProblem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Get top 3 elements from the list
public class Problem_No_11 {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        List<Integer> list=listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println(list);
    }
}
