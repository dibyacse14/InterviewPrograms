package com.dibya.array;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] ints = mergArrayWithNewArray(new int[]{1, 3, 5, 7}, new int[]{2, 4, 6, 8, 10});
        for(int i : ints)
            System.out.println(i);
    }

    private static int[] mergArrayWithNewArray(int[] arr1, int[] arr2) {

        int newL = arr1.length+arr2.length;
        int[] resltArr = new int[newL];
        int l=0,r =0;
        int curL=0;
        int currR=0;
        for (int i=0; i<newL; i++){
            if(l<arr1.length){
                curL = arr1[l];
            } else {
                curL = arr2[r];
            }

            if(r<arr2.length){
                currR = arr2[r];
            } else{
                currR = arr1[l];
            }


            if(curL<currR){
                resltArr[i]=curL;
                    l++;
            } else {
                resltArr[i]=currR;
                    r++;
            }

        }

        return resltArr;
    }
}
