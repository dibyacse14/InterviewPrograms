package com.dibya.copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeepCopyEx {
    private int[] data;
    private List<String> myList;
    public DeepCopyEx(int[] values,List myList){
        data=new int[values.length];
        for(int i =0;i<values.length;i++){
            data[i]=values[i];
        }

        this.myList = new ArrayList<>(myList);
    }

    public void showData(){
        System.out.println(Arrays.toString(data));
        System.out.println(myList);
    }
}
