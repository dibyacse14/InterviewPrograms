package com.dibya.copy;

import java.util.ArrayList;

public class UsesEx {
    public static void main(String[] args) {
        System.out.println("********* Shallow copy *********");
        int[] vals = {1,3,5};
        ArrayList<String> myList = new ArrayList<>();
        myList.add("abc");
        ShallowCopyEx sc = new ShallowCopyEx(vals,myList);
        sc.showData();
        vals[0] = 99;
        myList.add("abn");
        sc.showData();

        System.out.println("********* Deep copy *********");

        int[] vals1 = {1,3,5};
        ArrayList<String> myList1 = new ArrayList<>();
        myList1.add("abc");
        DeepCopyEx dc = new DeepCopyEx(vals1,myList1);
        dc.showData();
        vals1[0] = 88;
        myList1.add("abn");
        dc.showData();
    }
}
