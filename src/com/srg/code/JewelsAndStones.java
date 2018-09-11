package com.srg.code;

import java.util.TreeSet;

public class JewelsAndStones {

    public static void main(String[] args) {
        String J = "aB", S = "aBBdddd";
        System.out.println(numJewelsInStones(J, S));
    }

    private static int numJewelsInStones(String J, String S) {
        char[] c = new char[200];
        int count = 0;
        for (char ch : J.toCharArray()) {
            c[ch] = 1;
        }
        for (char ch : S.toCharArray()) {
            if (c[ch] == 1) count++;
        }
        return count;
    }
}
