package com.companycoding.platform.DailyCodeProblem;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem_No_02 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("earth", "heart", "lemon", "melon", "dormitory", "dirty", "room");

          Map<String,List<String>> maplist=list.stream().collect(Collectors.groupingBy(grp->{
              char[] ch=grp.toCharArray();
              Arrays.sort(ch);
              return new String(ch);
          }));
          System.out.println(maplist);

          maplist.entrySet().stream().filter(stringListEntry -> stringListEntry.getValue().size()>1).forEach(System.out::println);
    }
}