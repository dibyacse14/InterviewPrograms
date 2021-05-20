package com.dibya;

import java.io.*;
import java.util.*;

public class WordCount {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/Users/dibya/Downloads/InterviewPrograms/src/main/java/com/dibya/programs/abc.txt");
        BufferedReader br = new BufferedReader(fileReader);
        String str = br.readLine();

        List<String> arr = Arrays.asList(str.split(" "));

        HashMap<String,Integer> count = new HashMap<>();

        for(String value : arr){
            if(count.containsKey(value)){
                count.put(value,count.get(value)+1);
            } else {
                count.put(value,1);
            }
        }

        List<Map.Entry<String, Integer>> keyList =
                new LinkedList<>(count.entrySet());
        System.out.println("Before sort : "+count);

        Collections.sort(keyList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue()==o2.getValue()?-(o1.getKey()).compareTo(o2.getKey()):-(o1.getValue()).compareTo(o2.getValue());
            }
        });
// Sort the list using lambda expression
        Collections.sort(
                keyList,
                (o1,
                 o2) -> o1.getValue()==o2.getValue()?-(o1.getKey()).compareTo(o2.getKey()):-(o1.getValue()).compareTo(o2.getValue()));
        HashMap<String,Integer> sortedMap = new LinkedHashMap<>();

        for(Map.Entry<String,Integer> me:keyList){
            sortedMap.put(me.getKey(),me.getValue());
        }

        System.out.println("After sort : "+sortedMap);
    }
}
