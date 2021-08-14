package com.dibya.opentext;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratePalindrome {
    public static void main(String[] args) {
        System.out.println(genPalindrome(8,3));
//        System.out.println(solution(5,2));
    }
    public static String genPalindrome(int length, int nchars) {
        // some palindromes cannot be created with supplied conditions.
//        if (nchars < ((length+1)/2) || nchars > 26) {
//            System.out.printf("Not possible with '%d' character set and a length of %d%n", nchars, length);
//            return null;
//        }

        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Random r = new Random();
        StringBuilder part1 = new StringBuilder();

        int halfLength = (int) Math.floor((length+1)/2);
        // this loop generates distinct characters and
        // appends them to the StringBuilder
        while(halfLength-- > 0) {
            if(nchars == 0){
                nchars =1;
            }
            int s =8;

            int ci = r.nextInt(Math.abs(nchars));
            part1.append(chars[ci]);
            chars[ci] = chars[--nchars];
        }
        return part1.append(new
                StringBuilder(part1).reverse().substring(length%2)).toString();
    }
    public static String solution(int a, int b) {
        if (a % 2 != 0) {
            throw new IllegalArgumentException("a must be an even number.");
        }
        if (b > 26 || b < 0) {
            throw new IllegalArgumentException("b must be between the random of 0 and 26.");
        }
        Random random = new Random();

        StringBuilder result = new StringBuilder(a / 2);

        StringBuilder reverse = new StringBuilder(a / 2);

        List<Integer> distinctChars = new ArrayList<>();

        for (int i = 0; i < b; i++) {
            int distinct;

            while (true) {
                distinct = 'a' + random.nextInt(26);

                if (distinctChars.contains(distinct)) {
                    continue;
                }
                break;
            }
            distinctChars.add(distinct);
        }

        for(int i = 0; i < a / 2; i++) {
            int letter = distinctChars.get(random.nextInt(distinctChars.size()));

            result.append((char) letter);

            reverse.insert(0, (char) letter);
        }
        return result.toString() + reverse.toString();
    }
}
