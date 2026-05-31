package com.companycoding.platform.DailyCodeProblem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

///Remove duplicates without distinct()
public class Problem_No_03 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);

        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        List<Integer> list1 =list.stream().filter(hashSet::add).toList();
        System.out.println(list1);

    }
}

