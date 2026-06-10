package com.companycoding.platform.DailyCodeProblem;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
//First non-repeating character in a String
public class Problem_No_26 {
    public static void main(String[] args) {

        String input = "aabbcdeffg";

        String firstNonRepeating = Arrays.stream(input.split(""))
                .filter(ch ->
                        Collections.frequency(
                                Arrays.asList(input.split("")),
                                ch) == 1)
                .findFirst()
                .orElse(null);

        System.out.println("First Non-Repeating Character: " + firstNonRepeating);
    }
}
