package com.dibya.inteviewhackerank;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Anagram {
    static boolean isAnagram(String a, String b) {
        char[] arrA = a.toLowerCase().toCharArray();
        Arrays.sort(arrA);
        char[] arrB = b.toLowerCase().toCharArray();
        Arrays.sort(arrB);
        return Arrays.equals(arrA,arrB);
    }
//    static boolean isAnagramUsingHashing(String a, String b) {
//        if (a.length() == b.length()) {
//            Set<Character> setOfstring = new TreeSet<>();
//            for (int i = 0; i < a.length(); i++) {
//                if (!setOfstring.add(a.charAt(i))) {
//
//                }
//            }
//        } else {
//            return false;
//        }
//    }
    public static void main(String[] args) {

        if(isAnagram("abC","bca")){
            System.out.println("both are anagram");
        }
    }

}
