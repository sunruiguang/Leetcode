package com.srg.code;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i :
                nums) {
            hashSet.add(i);
        }
        return hashSet.size();
    }
}
