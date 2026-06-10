package com.companycoding.platform.DailyCodeProblem;

import java.util.Arrays;
import java.util.stream.IntStream;
//Find the longest common prefix.
public class Problem_No_24 {

   /* public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String first = strs[0];

        int length = IntStream.range(0, first.length())
                .filter(i -> Arrays.stream(strs)
                        .anyMatch(s -> i >= s.length() || s.charAt(i) != first.charAt(i)))
                .findFirst()
                .orElse(first.length());

        return first.substring(0, length);
    }*/


    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String Prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(Prefix)) {
                Prefix = Prefix.substring(0, Prefix.length() - 1);
                if (Prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return Prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("The Prfexi IS == "+longestCommonPrefix(strs));
    }
}