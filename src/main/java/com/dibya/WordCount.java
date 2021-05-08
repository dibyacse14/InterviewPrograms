package com.dibya;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WordCount {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/abc.txt");
        FileInputStream fis = new FileInputStream(file);

        String str = "Kumar is a good guy, Kumar is working in a store as shop keeper. Kumar was previously working in a shop named detail store";

        List<String> arr = Arrays.asList(str.split(" "));

        HashMap<String,Integer> count = new HashMap<>();

        for(String value : arr){
            if(count.containsKey(value)){
                count.put(value,count.get(value)+1);
            } else {
                count.put(value,1);
            }
        }

//        count.
//        System.out.println(count);

    }
}
