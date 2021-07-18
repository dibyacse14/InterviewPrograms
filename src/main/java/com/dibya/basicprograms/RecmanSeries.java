package com.dibya.basicprograms;

import java.util.Scanner;

public class RecmanSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no of item in series : ");
        int n = s.nextInt();
        printRecmanSries(n);
    }

    private static void printRecmanSries(int n) {
        int arr[] = new int[n];
//        System.out.print(arr[0]+" ,");
        int curr = 0;
        for(int i =1; i<n; i++){
            if(curr-i >0){
                boolean found = checkInArr(curr-i,arr);
                if(!found){
                    arr[i]=curr-i;
                    curr = curr-i;
                } else {
                    curr = curr+i;
                    arr[i]=curr;
                }
            } else {
                curr = curr+i;
                arr[i]=curr;
            }

        }
        for (int i : arr){
            System.out.print(i+ " ,");
        }

    }

    private static boolean checkInArr(int i,int[] arr) {
        for (int x: arr){
            if(i==x)
                return true;
        }
        return false;
    }
}
