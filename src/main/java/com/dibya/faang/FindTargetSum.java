package com.dibya.faang;

import java.util.HashMap;

/**
 * Find indeces of element in a array which is target sum
 * inpu {1,3,7,2,9} ,traget 11
 * op :{3,4}
 * Brute force approach
 *
 * Time complexcity O(n^2) , Auxilary space O(1)
 * */

public class FindTargetSum {
    public static int[] findSumIndeces(int[] arr,int target){
        int[] result = new int[]{-1,-1};

        if(arr.length <=1){
            result[0]=-1 ;
            result[1]=-1 ;
        } else{
            int i =0;
            while (i<arr.length){
                int curr = arr[i];
                int find = target-curr;
                int j =i+1;
                while (j<arr.length){
                    if(arr[j]==find){
                        result[0]=i;
                        result[1]=j;
                        break;
                    }
                    j++;
                }
                i++;
            }

        }

        return  result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,7,11,15};
//        int[] sumIndeces = findSumIndeces(arr, 9);
        int[] sumIndeces = findSumIndecesByHashmap(arr, 9);
        for (int i : sumIndeces)
            System.out.print(i+" ");
        System.out.println();
    }

    private static int[] findSumIndecesByHashmap(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap();
        for (int i =0; i<nums.length; i++){
            int res = target-nums[i];
            if(map.containsKey(res)){
                int ind1 = map.get(res);
                return new int[]{ind1,i};
            } else {
                map.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
