package com.company;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,23,6,0,12,123,6,5,1,99,3,4,1,2);
         List<Integer> list1= Collections.singletonList(list.stream().mapToInt((x)->Integer.parseInt(x.toString())).sum());
        System.out.println("srednee znachenie");
        list.stream().mapToInt(i->i).average().ifPresent(System.out::println);
        System.out.println("Summa");
        OptionalDouble list3= list.stream().mapToInt((x)->Integer.parseInt((String.valueOf(x)))).average();
        System.out.println(list1);
        System.out.println(list.stream().collect(Collectors.groupingBy(Function.identity())));
        System.out.println("kolichestvo znachenii");
        System.out.println(list.size());

    }
}