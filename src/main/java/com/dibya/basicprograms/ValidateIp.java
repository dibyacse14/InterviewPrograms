package com.dibya.basicprograms;

public class ValidateIp {
    public static void main(String[] args) {
       String ip =  "100.255";
       //0-255;
        boolean valid = isValidIp(ip);
        if(valid){
            System.out.println("Valid ip address");
        } else {
            System.out.println("INvalid Ip address");
        }
    }

    private static boolean isValidIp(String ip) {

        if(ip.length() > 15){
            return  false;
        }
        String[] ipArr = ip.split(".");
        boolean flag = true;
        for(int i =0; i<ipArr.length;i++){
            int seg = Integer.valueOf(ipArr[i]);
            System.out.println(seg);
            if((seg <= 0) && (seg >= 255)){
                flag =  false;
                break;
            }
        }
        return  flag;
    }
}
