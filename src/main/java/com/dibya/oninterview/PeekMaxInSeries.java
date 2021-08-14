package com.dibya.oninterview;

import java.util.ArrayList;
import java.util.List;

/**
 * Program to get max element in series , where the decrement start again.
 * Array input {1,3,4,5,10,6,7,8,9,24,4,5}
 * Target ouput {10,24}
 * Expected Time complexity < O(n)
 * @author dibya
 *
 * */
public class PeekMaxInSeries {

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,5,10,6,7,8,9,24,4,5};
        Object[] peek = findPeekElement(arr);
        System.out.println("result 1 : ");
        for (Object i :peek){
            System.out.print((int)i);
        }
        Object[] peekB = findPeekElementByBiSearch(arr,0,arr.length-1);
        System.out.println("result 2 : ");
        for (Object i :peekB){
            System.out.print((int)i);
        }
    }

    private static Object[] findPeekElementByBiSearch(int[] arr, int l, int r) {
        List<Integer> result = new ArrayList<>();
        int m = (l+r)/2;
        if((arr[m] >= arr[m - 1] &&
                arr[m] >= arr[m + 1])){
            result.add(m);
        }
        while (l<=r){
            findPeekElementByBiSearch(arr,l,m);
            findPeekElementByBiSearch(arr,m+1,r);
        }
        return result.toArray();
    }

    private static Object[] findPeekElement(int[] arr) {
        List<Integer> result = new ArrayList<>();

        for (int i=1; i<arr.length-1; i++){
            if((arr[i] >= arr[i - 1] &&
                    arr[i] >= arr[i + 1])){
                result.add(i);
            }
        }

        return result.toArray();
    }
}
