package com.dibya.opentext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *Description
 * Given an array A consisting of N integers, returns the maximum sum of two numbers whose digits add
 * up to an equal sum. if there are not two numbers whose digits have an equal sum, the function should return -1.
 * */
/**
 * @return: returns the maximum sum of two numbers
 */
public class SolutionMaxSum {

    public static int digitSum(int n){
        int sum = 0;
        while(n >= 10){
            sum += n % 10;
            n = n / 10;
        }
        sum += n;
        return sum;
    }
    public static int solution(int[] A) {
        // write your code here
        HashMap<Integer, ArrayList<Integer>> hash = new HashMap<Integer, ArrayList<Integer>>();
        int sum = -1;

        for(int i = 0;i < A.length;i++){
            int temp = digitSum(A[i]);
            if(hash.containsKey(temp)){
                hash.get(temp).add(A[i]);
            }
            else{
                ArrayList<Integer> nums = new ArrayList<Integer>();
                nums.add(A[i]);
                hash.put(temp, nums);
            }
        }

        for(Integer key : hash.keySet()){
            if(hash.get(key).size() < 2) continue;
            Collections.sort(hash.get(key));
            ArrayList<Integer> num = new ArrayList<Integer>(hash.get(key));
            int n = num.size();
            sum = Math.max(sum, num.get(n - 1) + num.get(n - 2));
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{51,71,17,42};
        int result = solution(arr);
        System.out.println("Result "+result);
        int[] arr1 = new int[]{33,60,42};
        int result1 = solution(arr1);
        System.out.println("Result "+result1);
        int[] arr2 = new int[]{51,32,43};
        int result2 = solution(arr2);
        System.out.println("Result "+result2);
    }
}