package com.dibya.basicprograms;

public class SumOfAmountInUSD {
    public static int itotalSumRegex(String s){
        String[] strArray = s.split("\\s");
        for (String x :strArray){
            if(x.contains("$")){
                System.out.println("val : "+x.replaceAll("[\\$,.]",""));
            }
        }
        return 0;
    }
    public static int sumTotal(String str){
        boolean foundAmount = false;
        String amountEach ="";
        int totalSum=0;
        int strl= str.length();
        int count=0,counti=0;
        for(int i =0 ;i<str.length() ; i++){
            counti++;
            if(str.charAt(i)=='$'){
                foundAmount =true;
                int j =i;
                while(foundAmount){
                    count++;
                   if(str.charAt(j+1)==','){
                       j++;
                       continue;
                   } else {
                       try {
                           int k = Integer.parseInt(String.valueOf(str.charAt(j+1)));
                           amountEach = amountEach+k;
                       } catch (Exception e){
                           foundAmount = false;
                           totalSum = Integer.parseInt(amountEach)+totalSum;
                           amountEach="";
                       }

                   }
                    j++;
                }
                i=j;
            }

        }

        System.out.println(strl +" "+count+" "+counti);
        return totalSum;
    }
    /*"#1 Tickets $50,000 Received $40. Expenses $800 . Cheque$2,00,000."*/
    public static void main(String[] args) {
        int k = sumTotal("#1 Tickets $50,000 Received $40. Expenses $800 . Cheque$2,00,000.");
        System.out.println("#1 Tickets $50,000 Received $40. Expenses $800 . Cheque$2,00,000.");
        System.out.println(k);
        itotalSumRegex("#1 Tickets $50,000 Received $40. Expenses $800 . Cheque$2,00,000.");
    }
}
