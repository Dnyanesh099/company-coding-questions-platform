package com.companycoding.platform.DailyCodeProblem;

import java.util.Arrays;
import java.util.List;

//Check all numbers even or not
public class Problem_No_06 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        Boolean isTrue= numbers.stream().allMatch(n->n%2==0);
        System.out.println(isTrue);

    }
}
