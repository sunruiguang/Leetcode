package com.srg.code;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 2 , 2, 3};
        int val = 2;
        System.out.println(removeDuplicates(nums, val));
    }

    private static int removeDuplicates(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
