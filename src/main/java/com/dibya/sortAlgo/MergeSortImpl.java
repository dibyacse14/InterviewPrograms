package com.dibya.sortAlgo;

public class MergeSortImpl {

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    static  void merge(int arr[],int l,int m , int r){
        int n1 = m-l+1;
        int n2 = r-m;

        //create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        //copy data  to temp array
        for(int i=0;i<n1 ; ++i){
            L[i] = arr[l+i];
        }
        for(int j=0;j<n2 ; ++j){
            R[j] = arr[m+1+j];
        }

        //merge the temp arrays
        //initial index of first and second array

        int i=0,j=0;
        //initial index of merged subarray
        int k=l;

        while(i < n1 && j<n2){
            if(L[i]<R[j]){
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        //copy remaing of L
        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        // copy remaining of R
        while (j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    static void sort(int arr[],int l, int r){
        if(l<r){
            int mid = l+ (r-1)/2;

            //sort first and second halfs
            sort(arr,l,mid);
            sort(arr,mid+1,r);

            //merge
            merge(arr,l,mid,r);
        }

    }

    static void printArray(int arr[]){
        for (int i =0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] newArr = new int[]{2,1,3};
        System.out.print("Given Array : ");
        printArray(newArr);

        sort(newArr,0,newArr.length-1);

        System.out.println("Sorted Array : ");
        printArray(newArr);
    }
}
