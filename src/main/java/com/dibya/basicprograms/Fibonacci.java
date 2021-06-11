package com.dibya.basicprograms;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many fibonacci no you want :");
        int n = sc.nextInt();
        int a=0,b=0,c=1;
        for(int i = 0; i<n; i++){
            a=b;
            b=c;
            c=a+b;
            System.out.print(a+" ");
        }
    }
}
