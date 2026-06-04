package com.companycoding.platform.DailyCodeProblem;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Convert the list of sentences into unique words
public class Problem_No_17 {
    public static void main(String[] args) {
        List<String> sentences = List.of("java is cool", "cool code in java");

        Set<String> words=sentences.stream().flatMap(s -> Arrays.stream(s.split(" "))).collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(words);
    }
}
