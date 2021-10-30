package com.chajiu.array;

/**
 * https://leetcode-cn.com/problems/longest-common-prefix/
 */
public class q14 {

    public static String longestCommonPrefix(String[] strs) {
        int i=0;
        boolean run =true;
        while(run){
            char c = i>=strs[0].length()?' ':strs[0].charAt(i);
            for (String str : strs) {
                if(i >= str.length() || str.charAt(i)!=c){
                  run=false;
                  i--;
                  break;
                }
            }
            i++;
        }
        return strs[0].length()==0?"":strs[0].substring(0,i);

    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{""}));
    }



}
