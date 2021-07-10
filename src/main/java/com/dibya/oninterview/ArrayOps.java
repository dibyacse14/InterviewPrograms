package com.dibya.oninterview;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ArrayOps {
    public static void main(String[] args) {
        int[] arr = new int[]{5,2,3,3,4,1};
        int index=3;
        Set<Integer> uniqueArr = new TreeSet<Integer>();
        for(int i =0 ;  i<arr.length ; i++){
            uniqueArr.add(arr[i]);
        }
        System.out.println(uniqueArr);
        Iterator<Integer> itr = uniqueArr.iterator();
        int count =1;
        while(itr.hasNext() && count <=index){

            if(count==index){
                System.out.println(itr.next());
                break;
            } else{
                itr.next();
            }
            count++;
        }
    }
}
