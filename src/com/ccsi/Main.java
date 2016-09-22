package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    String a="111";
        String b="1";
        System.out.println(addBinary(a,b));
    }
    //Given two binary strings,return their sum(also a binary string)
    public static String addBinary(String a,String b){
        String s="";
        int i=a.length()-1,j=b.length()-1,c=0;    //从string的最后往前加，c作为中间值，取余，除2进位
        while(i>=0||j>=0||c==1){                   //c==1，主要是为了可能最后一次进位
            c+=i>=0?a.charAt(i--)-'0':0;           //i或j小于0的时候，就是超出了高位数，用0取代。
            c+=j>=0?b.charAt(j--)-'0':0;
            s=(char)(c%2+'0')+s;
            c/=2;
        }
        return s;
    }
}
