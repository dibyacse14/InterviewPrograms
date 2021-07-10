package com.dibya.inteviewhackerank;

import java.util.Scanner;
/*James found a love letter that his friend Harry has written to his girlfriend. James is a prankster, so he decides to meddle with the letter. He changes all the words in the letter into palindromes.

To do this, he follows two rules:

He can only reduce the value of a letter by 1, i.e. he can change d to c, but he cannot change c to d or d to b.
The letter a may not be reduced any further.
Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations required to convert a given string into a palindrome.

For example, given the string s=cde, the following two operations are performed: cde → cdd → cdc.

@Author Dibya
*/
public class LoveLetterMistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();sc.nextLine();
        for(int i =0 ; i<t ; i++){
            String s = sc.nextLine();
            int count=0;
            for(int j=0;j<s.length()/2;j++){
                count+=Math.abs(s.charAt(j)-s.charAt(s.length()-1-j));
            }

            System.out.println(count);
        }
    }
}
