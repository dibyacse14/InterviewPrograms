package com.dibya.oninterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Find triplets in ascending order
 * input array {12,3,1,2,5,-6,-8,6} target sum - 0
 * output {{-8,2,6},{-6,1,5}...}
 * */
public class FIndTrplets {
//    12,3,1,2,5,-6,-8,6
    //stack

    //sorted
    // 3 placeholder
    public static void main(String[] args) {
        int[] nums = new int[]{12,3,1,2,5,-6,-8,6};
        Arrays.sort(nums);
        int target = 0;
        List<List<Integer>> result = findTripltesSum(nums,target);

    }

    private static List<List<Integer>> findTripltesSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i =0 ; i< nums.length-2; i++){
            int j = i+1;
            int k = nums.length-i;
        }
        return null;
    }



}
