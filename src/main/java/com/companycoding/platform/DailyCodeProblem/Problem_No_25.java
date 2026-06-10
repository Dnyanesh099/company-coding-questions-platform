package com.companycoding.platform.DailyCodeProblem;

import java.util.Arrays;
// Max Product in a given array
public class Problem_No_25 {
    public static void main(String[] args) {

        int[] array = {1, 4, 9, 6, 2, 7, 8};

       /* int[] topTwo = Arrays.stream(array)
                .boxed()
                .sorted((a, b) -> b - a)
                .limit(2)
                .mapToInt(Integer::intValue)
                .toArray();

        int maxProduct = topTwo[0] * topTwo[1];

        System.out.println("Maximum Product = " + maxProduct);*/

        int[] sorted = Arrays.stream(array).sorted().toArray();

        int n = sorted.length;
        int maxProduct = sorted[n - 1] * sorted[n - 2];

        System.out.println(maxProduct);
    }

}
