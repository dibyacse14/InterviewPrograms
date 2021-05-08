package com.dibya.programs.functionalprograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ImplementPredicate {
    public static int totalValue(List<Integer> values, Predicate<Integer> selector){
        int result = 0;
        for(int e: values){
            if (selector.test(e)){
                result += e;
            }
        }
        return result;
    }
    public static int totalValueWithStream(List<Integer> values, Predicate<Integer> selector){

        return values.stream().filter(selector).reduce(0,Integer::sum);
    }
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(totalValue(values,e->true));
        System.out.println(totalValue(values,e->e%2==0));
        System.out.println(totalValue(values,e->e%2!=0));
        System.out.println(totalValueWithStream(values,e->true));
        System.out.println(totalValueWithStream(values,e->e%2==0));
        System.out.println(totalValueWithStream(values,e->e%2!=0));
    }
}
