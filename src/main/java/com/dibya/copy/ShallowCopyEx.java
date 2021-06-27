package com.dibya.copy;

import java.util.Arrays;
import java.util.List;

public class ShallowCopyEx {
    private int[] data;
    private List<String> myList;
    public ShallowCopyEx(int[] values,List myList){
        data=values;
        this.myList=myList;
    }

    public void showData(){
        System.out.println(Arrays.toString(data));
        System.out.println(myList);
    }
}
