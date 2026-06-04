package com.companycoding.platform.DailyCodeProblem;
import java.util.Arrays;

//Sum of all digits in a number
public class Problem_No_13 {
    public static void main(String[] args) {

        int i=15623;

        Integer SumofDigit= Arrays.stream(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();

        System.out.println(SumofDigit);

    }
}
