package com.srg.code;

public class ImplementStr {
    public static void main(String[] args) {
        String haystack = "bbbbba";
        String needle = "bba";
        System.out.println(strStr(haystack,needle));
    }

    private static int strStr(String haystack, String needle){
        return haystack.indexOf(needle);
    }
}
