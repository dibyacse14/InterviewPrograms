package com.dibya.basicprograms;


import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        //on input 7868686 getting wrong ans in binary while taking int
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter a no to find square root :");
        int x = s.nextInt();
        long st = System.nanoTime();
        double i = findSqrt(x);
        long n =(System.nanoTime()-st);
        System.out.println("Square root of no is : "+i+"  time taken "+n);
        st = System.nanoTime();
        double r = findSqrtByBinarySearch(x);
//        System.out.println("binary Square root of no is : "+r);
        long b = (System.nanoTime()-st);
        System.out.println("binarySquare root of no is : "+r+"  time taken "+b);
        Double p = Double.valueOf((b*100/n) );
        System.out.println("performance increase by "+p+" %");
    }

    private static double findSqrtByBinarySearch(int x) {
        if(x==0  || x ==1){
            return 0;
        } else {
            long start =1,end =x,ans = 0;
            while (start<=end){
                long mid = (start+end)/2;
                if(mid*mid ==x){
                    return mid;
                } else if(mid*mid < x){
                    start = mid+1;
                    ans=mid;
                } else {
                    end =  mid-1;
                }
            }
            return ans;
        }

    }

    private static double findSqrt(int x) {
        if(x==0  || x ==1){
            return 0;
        }
        int i =1 ,result=1;
        while (result<=x){
            i++;
            result = i*i;
        }
        return i-1;
    }
}
