package com.dibya.basicprograms;

public class Demo {
    public static void main(String[] args) {

        String str = "100.52.";
        String result = "";
        for(int i =0; i< str.length();i++){
            int asciivalue = (int)str.charAt(i);
            char togChar = str.charAt(i);
            if(asciivalue < 97 && asciivalue >64){
                togChar = (char)(asciivalue+32);
            } else if(asciivalue < 128 && asciivalue >96){
                togChar = (char)(asciivalue-32);
            }
            result = result + togChar;
        }
        System.out.println((int)'z');
    }
}
