package com.dibya.algo;

import java.util.Scanner;

public class BinarySearchImpl {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[]{2,4,33,55,44,66};
        for(int v : arr)
            System.out.print(v+" ");
        System.out.println();
        System.out.println("Enter a no from array to search");
        int x = s.nextInt();
        int i = searchWithBinary(arr,0,arr.length-1,x);
        System.out.println("Index of item searched is : "+i);
    }

    private static int searchWithBinary(int[] arr, int l, int r, int x) {
        if(l >= r){
            return -1;
        } else {
            int mid = (l+r)/2;
            if(arr[mid]==x){
                return mid;
            } else if(arr[mid] > x){
                return searchWithBinary(arr,l,mid-1,x);
            } else {
                return searchWithBinary(arr,mid+1,r,x);
            }

        }

    }
}
