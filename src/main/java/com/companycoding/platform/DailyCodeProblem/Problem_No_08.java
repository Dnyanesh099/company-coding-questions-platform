package com.companycoding.platform.DailyCodeProblem;

import java.util.Arrays;
import java.util.List;

// Find Palindrome Strings
public class Problem_No_08 {

    public static void main(String[] args) {
        List<String> palindromeNames = Arrays.asList("Telugu", "Tamil", "Malayalam");

        //List<String>result=palindromeNames.stream()
               // .filter(s->s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())).toList();

        List<String>result=palindromeNames.stream().filter(s->{

            String rev="";
            for (int i=s.length()-1;i>=0;i--)
            {
                rev+=s.charAt(i);
            }
            return  s.equalsIgnoreCase(rev);
        }).toList();
        System.out.println(result);
    }
}
