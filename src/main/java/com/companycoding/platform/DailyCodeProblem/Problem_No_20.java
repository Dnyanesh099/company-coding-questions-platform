package com.companycoding.platform.DailyCodeProblem;

import java.util.Arrays;
import java.util.List;

//How do you get distinct characters from a list of words?
public class Problem_No_20 {
    public static void main(String[] args) {

        List<String> words = List.of("java", "scala");

        List<String> list= words.stream().flatMap(w-> Arrays.stream(w.split(""))).distinct().toList();
        System.out.println(list);
    }
}
