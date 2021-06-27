package com.dibya.inteviewhackerank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GeneratePalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of distinct char to use");
        int distinct = sc.nextInt();
        System.out.println("Enter Palindrome size :");
        int size = sc.nextInt();
        String palindrome = generatePalindromeString(distinct,size);
    }

    private static String generatePalindromeString(int distinct, int size) {
        String result = "";
        char[] arr = new char[size];
        if(size < 2 )
            return "a";
        List<String> azList = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
        List<String> stringPoolList = new ArrayList<>();
        while(distinct > 0){
            stringPoolList.add(azList.get(distinct));
            distinct--;
        }
        int count = 0;
        while (count < size){
            result = stringPoolList.get(count);
        }
        return result;
    }
}
