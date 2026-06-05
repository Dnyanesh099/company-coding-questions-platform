package com.companycoding.platform.DailyCodeProblem;

import java.util.List;

//You have List<List<Integer>>. How do you create a single List<Integer>?
public class Problem_No_19 {

    public static void main(String[] args) {
        List<List<Integer>> nums= List.of(List.of(1,2),List.of(3,4));

          List<Integer> list=  nums.stream().flatMap(List::stream).toList();
          System.out.println(list);
    }
}
