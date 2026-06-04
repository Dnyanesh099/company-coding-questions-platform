package com.companycoding.platform.DailyCodeProblem;

import java.util.Arrays;
import java.util.stream.Collectors;

//Reverse each word of a string
public class Problem_No_15 {
    public static void main(String[] args) {

        String str = "Java Concept Of The Day";
        String  reversed= Arrays.stream(str.split(" ")).map(s->new StringBuilder(s).reverse()).collect(Collectors.joining(" "));
        System.out.println(reversed);
    }
}
