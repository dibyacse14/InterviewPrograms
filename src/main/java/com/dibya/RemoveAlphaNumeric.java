package com.dibya;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveAlphaNumeric {
    public static void main(String[] args) {
        HashMap<Integer,String> alphaMap = new HashMap<>();
        alphaMap.put(1,"hjs2jsdj");
        alphaMap.put(2,"Ac3&sh");
        alphaMap.put(6,"shs@sh");
        alphaMap.put(4,"abc");
        alphaMap.put(5,"def");
        Set<Map.Entry<Integer,String>> entrySet = alphaMap.entrySet();
        HashMap<Integer,String> newAlphaMap = new HashMap<>();
        for (Map.Entry<Integer,String> entry: entrySet) {
            int k = entry.getKey();
            String value = entry.getValue();
            if(value.matches("[^a-zA-Z0-9]+")){
                newAlphaMap.put(k,value);
            }
        }
        System.out.println(newAlphaMap);

        System.out.println(passwordValidation("Dibyah$1234"));
    }
    public static boolean passwordValidation(String password)
    {

        if(password.length()>=8)
        {
            Pattern letter = Pattern.compile("[a-zA-z]");
            Pattern digit = Pattern.compile("[0-9]");
            Pattern space = Pattern.compile("[\\d]");
            Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
            //Pattern eight = Pattern.compile (".{8}");


            Matcher hasLetter = letter.matcher(password);
            Matcher hasDigit = digit.matcher(password);
            Matcher hasSpecial = special.matcher(password);
            Matcher hasSpace = special.matcher(password);

            return hasLetter.find() && hasDigit.find() && hasSpecial.find() && hasSpace.find();

        }
        else
            return false;

    }
}
