package com.srg.code;

public class HammingDistance {

    public static void main(String[] args) {
        int x = 8, y = 12;
        System.out.println(hammingDistance(x, y));
    }

    private static int hammingDistance(int x, int y) {
        StringBuilder strx = new StringBuilder(Integer.toBinaryString(x)).reverse();
        StringBuilder stry = new StringBuilder(Integer.toBinaryString(y)).reverse();

        if (strx.length() > stry.length()) {
            for (int i = stry.length(); i < strx.length(); i++) {
                stry.append("0");
            }
        } else {
            for (int i = strx.length(); i < stry.length(); i++) {
                strx.append("0");
            }
        }
        int count = 0;
        for (int i = 0; i < strx.length(); i++) {
            if (strx.toString().charAt(i) != stry.toString().charAt(i)) count++;
        }
        return count;
    }
}
