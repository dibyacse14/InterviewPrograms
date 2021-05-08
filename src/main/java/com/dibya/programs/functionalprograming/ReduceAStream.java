package com.dibya.programs.functionalprograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceAStream {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(values.stream()
                                 .filter(e -> e % 2 == 0)
                                 .map(e -> e * 2)
                                 .reduce(0, (total, e) -> total = total + e));
        System.out.println(values.stream()
                                 .filter(e -> e % 2 == 0)
                                 .map(e -> e * 2)
                                 .reduce(0, (total, e) -> Integer.sum(total, e)));
        System.out.println(values.stream()
                                 .filter(e -> e % 2 == 0)
                                 .map(e -> e * 2)
                                 .reduce(0, Integer::sum));
        values.stream()
              .filter(e -> e % 2 == 0)
              .map(e -> e * 2)
              .count();


    }
}
