package com.dibya.basicprograms;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input = sc.nextLine();
        input = input.toLowerCase();
        boolean flag = true;
        for(int i = 0 ; i<input.length()/2 ; i++){
            if(input.charAt(i) != input.charAt(input.length()-i-1)){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("input is plaindrome");
        } else {
            System.out.println("input is not pallindrome");
        }
    }
}
