package com.companycoding.platform.DailyCodeProblem;

import java.util.Arrays;
import java.util.List;

        //Find all the Longest words in a list
public class Problem_No_21 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "pineapple", "blueberry");

        int maxlength=words.stream().map(String::length).max(Integer::compareTo).orElse(0);
        System.out.println(maxlength);

        List<String> list=words.stream().filter(word->word.length()==maxlength).toList();
        System.out.println(list);


    }
}
