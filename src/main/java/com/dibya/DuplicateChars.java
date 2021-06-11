package com.dibya;

import java.util.HashMap;

public class DuplicateChars {
    public static void main(String[] args) {
        String str = "aabvgbjkjn";
        HashMap<Character,Integer> wordCount = new HashMap<>();
        for (int i =0 ; i< str.length(); i++){
            if(wordCount.containsKey(str.charAt(i))){
                wordCount.put(str.charAt(i),wordCount.get(str.charAt(i))+1);
            } else {
                wordCount.put(str.charAt(i),1);
            }
        }
        System.out.println(wordCount);
    }
}
