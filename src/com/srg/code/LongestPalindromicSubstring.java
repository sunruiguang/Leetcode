package com.srg.code;

public class LongestPalindromicSubstring {

    private static String longest = "";

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }

    private static String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            isPalindrome(s, i, 0);
            isPalindrome(s, i, 1);
        }
        return longest;
    }

    private static void isPalindrome(String s, int l, int offset) {
        int left = l;
        int right = l + offset;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;

        }

        String curString = s.substring(left + 1, right);
        if (curString.length() > longest.length()) longest = curString;
    }
}
