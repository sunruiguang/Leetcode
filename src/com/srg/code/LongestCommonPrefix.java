package com.srg.code;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = new String[] { "flower","flower","flower" };
        System.out.println(longestCommonPrefix(str));
    }

    private static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        int minLength = strs[0].length();
        for (String str : strs) {
            minLength = minLength < str.length() ? minLength : str.length();
        }
        int j = 0;
        while (j < minLength) {
            boolean flag = false;
            for (int i = 1; i < strs.length; i++) {
                if (!(strs[i].charAt(j) == (strs[0].charAt(j)))) {
                    flag = true;
                }
            }
            if (flag)
                break;
            else
                j++;
        }
        return new StringBuffer(strs[0]).substring(0, j);
    }
}
