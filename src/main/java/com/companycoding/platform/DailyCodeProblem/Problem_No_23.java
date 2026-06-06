package com.companycoding.platform.DailyCodeProblem;

import java.util.Arrays;
import java.util.List;

//2. Find Maximum using reduce, List<Integer> numbers = Arrays.asList(7, 2, 10, 4);
public class Problem_No_23 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7, 2, 10, 4);

       Integer max= numbers.stream().reduce(Integer::max).orElse(0);
        System.out.println(max);
    }
}
