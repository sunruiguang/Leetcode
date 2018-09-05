package com.srg.code;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));
        sc.close();
    }

    private static boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(Integer.toString(x));
        String str1 = sb.toString();
        String str = sb.reverse().toString();
        return str1.equals(str);
    }
}
