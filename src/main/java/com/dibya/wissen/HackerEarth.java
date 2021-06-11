package com.dibya.wissen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

enum Lang{
    Python(10-10+10*10),Java(9+9*9-9),Angular(12*12-12-12);
    private int coders;
    Lang(int p){
        coders= p;
    }
    int getCoders(){
        return coders;
    }
}
public class HackerEarth {
    public static void main(String[] args) {
//        Lang as;
//        for(Lang a : Lang.values()){
//            System.out.println(a + " " +a.getCoders() +" coders.");
//        }
//        System.out.println(distribute(4));
//        System.out.println(countOvertake(4,new int[]{4,1,5,6}));
        System.out.println(LongestEvenLengthWord("This a sample input for problem"));
    }
    static boolean distribute(int N){
        boolean flag=false;
        if(N<2){
            return false;
        } else {
            for(int i = 2 ;i<N; i++){

                if(N%i ==0){
                    int result = N % i;
                    if(N/i >= 2)
                        flag = true;
                }

            }
        }
        return flag;
    }

    static long countOvertake(int N, int[] A ){
        long overtake = 0;
        for (int i = 0 ; i< A.length ; i++){
            if (A[i] > A[i+1]) {
                System.out.println(A[i]+" "+A[i+1]);
                for(int j = A[i+1] ; j< A[i] ; j++){
                    overtake++;
                }
                break;
            }
        }
        if(overtake >1){
            overtake = overtake-1;
        }
        return  overtake;
    }

    public static String LongestEvenLengthWord(String sentence) {
        String result = "";
        String[] words = sentence.split(" ");
        List<Integer> evenArray = new ArrayList();
        for (int i = 0 ; i< words.length ; i++){
            int wordCount = words[i].length();
            if(wordCount%2 ==0){
                evenArray.add(wordCount);
            }
        }
        Optional<Integer> maxNumber = evenArray.stream()
                                          .max((i, j) -> i.compareTo(j));
        for (int i = 0 ; i< words.length ; i++){
            int wordCount = words[i].length();
            if(wordCount == maxNumber.get()){
                result = words[i];
            }
        }
        return  result;
    }
}
