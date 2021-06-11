package com.dibya.leetcode;

public class LongestPalindrome {

    int resultStart;
    int resultLength;
    public String longestPalindromeString(String s){
        int strLength = s.length();
        if(strLength <2){
            return s;
        }
        for(int start=0 ; start < strLength -1 ; start++){
            expandRange(s,start,start);
            expandRange(s,start,start+1);
        }
        return s.substring(resultStart,resultStart + resultLength);
    }

    private void expandRange(String s, int begin, int end) {
        while(begin >= 0 && end < s.length() && s.charAt(begin)==s.charAt(end)){
            begin--;
            end++;
        }
        if(resultLength < end-begin-1){
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }
    }

    public static void main(String[] args) {
        LongestPalindrome lp = new LongestPalindrome();
        System.out.println(lp.longestPalindromeString("hhkjhabcdcbah"));
    }
}
