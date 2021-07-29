package com.dibya.basicprograms;

import java.util.ArrayList;
import java.util.List;

public class ArrEx {
    public static void main(String[] args) {

        List<Integer> indeces = findtheIndeces(new int[]{10,50,30,60,50,40,30,80,30},30);
//        int[] indeces = findtheIndeces(new int[]{33, 11, 10, 22, 33, 22},22);
        for (int i : indeces){
            System.out.println(i);
        }
    }

    private static List<Integer> findtheIndeces(int[] ints,int target) {
       List<Integer> result = new ArrayList<>();
        if(ints.length == 0){
            return result;
        }
        int targetFound=0,count=0;
        for (int i =0;i< ints.length;i++){
            int curr = ints[i];
            if(curr < target){
                count++;
            } else if(curr == target){
                targetFound++;
            }
        }
        if(targetFound >0 && count >0){
            int i =0;
            while (targetFound >0){

                result.add(count+i);
                i++;
                targetFound--;
            }
        } else {
            result.add(0);
        }
        return result;
    }

}
//6-2-2=2
//6-1-2= 3