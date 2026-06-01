package com.companycoding.platform.DailyCodeProblem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Find the longest word in a list
public class Problem_No_09 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "elephant", "dog", "giraffe", "zebra");

        Optional<String> result=words.stream().max(Comparator.comparing(String::length));
        result.ifPresent(w->System.out.println("The Longest word is : "+w));
    }
}
