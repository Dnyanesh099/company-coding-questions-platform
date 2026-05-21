package com.companycoding.platform.Deloitte;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Program: Group Anagrams Using Java Streams

    Description:
    Create a Java program to group all anagrams together
    using Stream API and Collectors.groupingBy().

    Concepts Used:
    - Java 8 Streams
    - groupingBy()
    - Arrays.sort()
    - Map
    - Anagram Logic

    Author: Dnyanesh Patil
*/

public class GroupAnagrams {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("earth", "heart", "lemon", "melon", "dormitory", "dirtyroom");

        Map<String, List<String>> mapList = list.stream().collect(Collectors.groupingBy(grp -> {
                            char[] ch = grp.toCharArray();
                            Arrays.sort(ch);
                            return new String(ch);
        }));

        mapList.entrySet().stream().filter(grp -> grp.getValue().size() > 1).forEach(System.out::println);
    }
}