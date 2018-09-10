package com.srg.code;

import java.util.Arrays;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }

    private static int searchInsert(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        if (index < 0) index++;
        return Math.abs(index);
    }
}
