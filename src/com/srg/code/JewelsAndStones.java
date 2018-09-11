package com.srg.code;

import java.util.TreeSet;

public class JewelsAndStones {

    public static void main(String[] args) {
        String J = "aB", S = "aBBdddd";
        System.out.println(numJewelsInStones(J, S));
    }

    private static int numJewelsInStones(String J, String S) {
        int count = 0;
        TreeSet<Character> treeSet = new TreeSet<>();
        for(int i = 0;i<J.length();i++){
            treeSet.add(J.charAt(i));
        }
        for(int i = 0;i<S.length();i++){
            if(treeSet.contains(S.charAt(i))) count++;
        }
        return count;
    }
}
