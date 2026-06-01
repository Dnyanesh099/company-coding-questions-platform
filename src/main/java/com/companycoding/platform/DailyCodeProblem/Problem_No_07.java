package com.companycoding.platform.DailyCodeProblem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

//Numbers starting with 1
public class Problem_No_07 {

    private static final Logger log = LoggerFactory.getLogger(Problem_No_07.class);

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,20,12,null,19,30);

       List<Integer> result=numbers.stream().filter(i->String.valueOf(i).startsWith("1")).toList();

        //List<Integer> result=numbers.stream().filter(i->i!=null).filter(i->i/10==1).toList();

        System.out.println(result);
    }
}
