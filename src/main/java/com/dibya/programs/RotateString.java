package com.dibya.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.logging.StreamHandler;
import java.util.stream.Stream;

/*
* Rotate a string with given input
*
* If input string is "programming" rotationFactor input = 1
* Expected output  "gprogrammin"
* */
public class RotateString {
    public static void main(String[] args) {
//        rotateAString180Degree();
        rotateAString360Degree();
    }
//This roation can be only 180 dgree not 360 degre
    public static String rotateAString180Degree(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String inputString = sc.nextLine();
        System.out.println("Enter rotation factor in number : ");
        int rotationCount = sc.nextInt();
        int sizeOfIS = inputString.length()-1;
        String substringOfIn ="";
        String result = "";
        if(inputString.length() < rotationCount) {
            System.out.println("invalid rotation");
        } else if(inputString.length() == 1){
            System.out.println(inputString);
        } else {
            substringOfIn = inputString.substring(0, inputString.length() - rotationCount);
            while (rotationCount>0){
                result = result+inputString.charAt(sizeOfIS);
                rotationCount--;
                sizeOfIS--;
            }
            System.out.println("Rotated string : "+result+substringOfIn);
        }
        return result+substringOfIn;
    }


    public static String rotateAString360Degree(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String inputString = sc.nextLine();
        System.out.println("Enter rotation factor in number : ");
        int rotationCount = sc.nextInt();
        System.out.println("Enter the direction start (S) or end (E)  : ");
        String direction = sc.nextLine().toUpperCase();
        while(!(direction.equals("S") || direction.equals("E"))){
            System.out.println("please choose correct direction start (S) or end (E) ");
            direction = sc.nextLine().toUpperCase();
        }
        String rotatedString="";
        if(direction.equalsIgnoreCase("S")){
            String hold = "";
            String substringOfIn;
            for(int i = 0 ; i<  rotationCount ; i++){
                hold = hold+inputString.charAt(i);
                if(i == inputString.length()){
                    i=0;
                    inputString=hold;
                }

            }
//            if(inputString.length()>rotationCount){
//                 substringOfIn = inputString.substring(0, inputString.length() - rotationCount);
//            }
//            rotatedString = substringOfIn
            System.out.println("hold : "+hold);
        }




        return null;
    }
}
