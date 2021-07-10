package com.dibya.inteviewhackerank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HourGlassArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter matrix size [x][x] : ");
//        int size = sc.nextInt();
//        sc.nextLine();
        List<List<Integer>> hourGlassMatrix = new ArrayList<>();
        Integer [] arr0 = new Integer[]{1,1,1,0,0,0};
        Integer [] arr1 = new Integer[]{0,1,0,0,0,0};
        Integer [] arr2 = new Integer[]{1,1,1,0,0,0};
        Integer [] arr3 = new Integer[]{0,0,2,4,4,0};
        Integer [] arr4 = new Integer[]{0,0,0,2,0,0};
        Integer [] arr5 = new Integer[]{0,0,1,2,4,0};
        /*for(int i=0; i< size ; i++){
            List<Integer> newInsideList = new ArrayList<>();
            for(int j=0 ; j<size ; j++){
                newInsideList.add(sc.nextInt());
            }
            System.out.println(newInsideList);
            hourGlassMatrix.add(newInsideList);
        }*/
        hourGlassMatrix.add(Arrays.asList(arr0));
        hourGlassMatrix.add(Arrays.asList(arr1));
        hourGlassMatrix.add(Arrays.asList(arr2));
        hourGlassMatrix.add(Arrays.asList(arr3));
        hourGlassMatrix.add(Arrays.asList(arr4));
        hourGlassMatrix.add(Arrays.asList(arr5));

        System.out.println(hourGlassMatrix);

        System.out.println(hourglassSum(hourGlassMatrix));
//        sumHourGlass(hourGlassMatrix);

    }
    /*1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0*/
    public static int hourglassSum(List<List<Integer>> arr) {
        int maxX=6,maxY=6;
        int total = Integer.MIN_VALUE;
        for(int x =0 ; x<maxX ; x++){
            for(int y =x;y<maxY ; y++){
                //sum of top in hour glass
                int sum = arr.get(x).get(y)+arr.get(x).get(y-1)+arr.get(x).get(y-2);

                //sum of middle in hour glass
                sum += arr.get(x-1).get(y-1);

                //sum of bottom in hour glass
                sum += arr.get(x-2).get(y)+arr.get(x-2).get(y-1)+arr.get(x-2).get(y-2);

                System.out.println(sum);
                if(total < sum){
                    total =sum;
                }
            }
        }
        return total;
    }

    static  void  sumHourGlass(List<List<Integer>> arrL){
        int arr[][] = new int[6][6];
        int maxSum = Integer.MIN_VALUE;;
        int sum = 0;

        for(int i=0; i < 6; i++)
        {
            for(int j=0; j < 6; j++)
            {
                arr[i][j] = arrL.get(i).get(j);

                if(i > 1 && j > 1)
                {
                    sum = arr[i][j] + arr[i][j - 1] + arr[i][j - 2]
                            + arr[i - 1][j - 1]
                            + arr[i - 2][j] + arr[i - 2][j - 1] + arr[i -2][j - 2];

                    if(sum > maxSum)
                    {
                        maxSum = sum;
                    }
                }
            }
        }

        System.out.println(maxSum);
    }
}
