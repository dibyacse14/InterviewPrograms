package com.dibya.programs.functionalprograming;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Price {
    List<BigDecimal> priceList = new ArrayList<>(Arrays.asList(
            new BigDecimal(12), new BigDecimal(11), new BigDecimal(21), new BigDecimal(18)));

    public void calculatePrice() {
        BigDecimal totalOfDiscountedPrices = BigDecimal.ZERO;

        for (BigDecimal price : priceList) {
            if (price.compareTo(BigDecimal.valueOf(20)) > 0) {
                totalOfDiscountedPrices = totalOfDiscountedPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
            }
        }
//        System.out.println(totalOfDiscountedPrices);

        //In way of java 8
        totalOfDiscountedPrices = priceList.stream()
                 .filter(e -> e.compareTo(BigDecimal.valueOf(20))>0)
                 .map(e -> e.multiply(BigDecimal.valueOf(0.9)))
                 .reduce(BigDecimal::add).get();
        System.out.println(totalOfDiscountedPrices);
    }

    public void biOperationAdd(int a , int b,BinaryOperator<Integer> accumulater){
        System.out.println(accumulater.apply(a,b).toString());
    }
    public static void main(String[] args) {
        Price price = new Price();
        price.calculatePrice();
        final BinaryOperator<Integer> biMultiply = (e, s) -> e * s;
        final BinaryOperator<Integer> biAdd = (e, s) -> e + s;
        price.biOperationAdd(3,5,biMultiply);
    }
}
