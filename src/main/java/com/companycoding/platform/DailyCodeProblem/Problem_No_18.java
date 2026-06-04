package com.companycoding.platform.DailyCodeProblem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Get 3rd highest element from the list
public class Problem_No_18 {
    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        Integer thirdHigest=listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(-1);
        System.out.println(thirdHigest);
    }
}
