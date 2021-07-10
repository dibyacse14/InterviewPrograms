package com.dibya.inteviewhackerank;

import java.io.IOException;
import java.util.*;

public class DiskSpaceAnalysis {
    private static int segment(int x,int[] space){

        List<List<Integer>>newList = new ArrayList<>();
        List<Integer> finalValue = new ArrayList<>();
        if(space.length >= x){
            int count =0;
            List<List<Integer>> superList = new ArrayList<>();
            List<Integer> sublist = new ArrayList<>();
            for(int i =0;i<space.length;i++){
                int result = 0;

                for(int k =i ; k<x ;k++){
                    sublist.add(space[k]);
                    result = space[k]-result;
                }

                superList.add(sublist);

                finalValue.add(Math.abs(result));
            }

        }
        return finalValue.stream().sorted(Comparator.reverseOrder()).findFirst().get();
    }
    public static void main(String[] args) throws IOException {


        int space[] = new int[]{3,5,4,8};

        System.out.println(segment(2,space));
    }
}
