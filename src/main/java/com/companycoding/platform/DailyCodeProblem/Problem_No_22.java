package com.companycoding.platform.DailyCodeProblem;

import java.util.Arrays;
import java.util.List;

//1. Sum of numbers List<Integer> numbers = Arrays.asList(5, 10, 15, 20);
public class Problem_No_22 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20);


        Integer sum=numbers.stream().reduce(Integer::sum).orElse(0);
        System.out.println(sum);
    }
}
