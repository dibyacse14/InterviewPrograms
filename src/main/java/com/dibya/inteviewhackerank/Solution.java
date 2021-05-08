package com.dibya.inteviewhackerank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'getMinimumDifference' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY a
     *  2. STRING_ARRAY b
     */

    public static List<Integer> getMinimumDifference(List<String> a, List<String> b) {
        List<Integer> result = new ArrayList<>();
        //test for invalid input 
        if(a.size() == 0 || b.size()==0){
            result.add(-1);
            return result;
        }
        if(a.size() != b.size()){
            result.add(-1);
            return result;
        }
        for(int i = 0; i < a.size(); i++){
            char[] arrAElement = a.get(i).toCharArray();
            char[] arrBElement = b.get(i).toCharArray();
            Arrays.sort(arrAElement);
            Arrays.sort(arrBElement);
            if(arrAElement.length != arrBElement.length){
                result.add(-1);
            } else if (Arrays.equals(arrAElement,arrBElement)){
                result.add(0);
            } else {
                result.add(countUnmatched(arrAElement,arrBElement));
            }
        }
        return result;
    }
    
    public static int countUnmatched(char[] charArray1, char[] charArray2){
        int noOfChar = 0;
        
        for(int i = 0; i< charArray1.length; i++){
            boolean matchF = false;
            for(int j =0 ; j< charArray2.length ; j++){
                if(charArray1[i] == charArray2[j]){
                    matchF = true;
                }
            }
            if(!matchF){
                noOfChar = noOfChar +1;
            }
        }
        return noOfChar;
    }
    
}

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("/Users/dibya/Downloads/InterviewPrograms/src/main/java/com/dibya/inteviewhackerank/input003.txt");
        BufferedReader bufferedReader = new BufferedReader(fr);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/dibya/Downloads/InterviewPrograms/src/main/java/com/dibya/inteviewhackerank/output.txt"));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> a = IntStream.range(0, aCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int bCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> b = IntStream.range(0, bCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> result = Result.getMinimumDifference(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}