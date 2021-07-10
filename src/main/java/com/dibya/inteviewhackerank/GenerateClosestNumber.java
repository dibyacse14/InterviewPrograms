package com.dibya.inteviewhackerank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class GenerateClosestNumber {
    private static int[] input;
    private static void computeCLosetNumber(int[] input){
        List<Integer> result = new ArrayList<>();
        Arrays.sort(input);
        int mindist = Integer.MAX_VALUE;
        Set<Integer> indexes = new HashSet<>();
        int currdist;

        for(int i=0 ; i<input.length-1 ; i++){
            currdist = input[i+1]-input[i];
            if(currdist < mindist){
                indexes = new HashSet<>();
                indexes.add(i);
                mindist = currdist;
            }
            if(currdist == mindist){
                indexes.add(i);
            }
        }
        Iterator<Integer> index = indexes.iterator();
        int next;
        while (index.hasNext()){
            next = index.next();
            result.add(input[next]);
            result.add(input[next+1]);
        }

        Collections.sort(result);
        for(int i =0 ; i<result.size();i++){
            System.out.println(result.get(i)+" "+result.get(i+1));
            i++;
        }
    }
    public static void main(String[] args) throws  IOException {

//        int N;
//        String[] temp;
//        String line = "";
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        line = br.readLine();
//        N = Integer.parseInt(line);
//        line = br.readLine();
//        temp = line.split(" ");
//        input = new int[N];
//
//        for(int i = 0; i < N; i++){
//            input[i] = Integer.parseInt(temp[i]);
//        }
        input = new int[]{3,5,4,8};

        computeCLosetNumber(input);
    }
}
