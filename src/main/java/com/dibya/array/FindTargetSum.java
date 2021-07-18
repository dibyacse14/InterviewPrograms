package com.dibya.array;

/**
 * Find indeces of element in a array which is target sum
 * inpu {1,3,7,2,9} ,traget 11
 * op :{}
 * */

public class FindTargetSum {
    public static int[] findSumIndeces(int[] arr,int target){
        int[] result = new int[2];

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
                    } else {
                        result[0]=-1 ;
                        result[1]=-1 ;
                    }
                    j++;
                }
                i++;
            }

        }

        return  result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,6,8,9};
        int[] sumIndeces = findSumIndeces(arr, 175);
        for (int i : sumIndeces)
            System.out.print(i+" ");
        System.out.println();
    }
}
