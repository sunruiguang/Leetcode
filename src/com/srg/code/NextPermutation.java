package com.srg.code;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {9, 7, 3, 8 ,4};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void nextPermutation(int[] nums) {
        int[] arrSign = new int[nums.length - 1];

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                arrSign[i] = 0;
            } else {
                arrSign[i] = 1;
            }
        }
        int j = arrSign.length - 1, index = arrSign[arrSign.length - 1];
        while (index != 1 && j >= 0) {
            index = arrSign[j];
            j--;
        }
        j = j < arrSign.length - 1 ? ++j : j;
        if (index == 1) {
            if (j == arrSign.length - 1) {
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            } else {
                if (nums[j] > nums[nums.length - 1]) {
                    int temp = nums[j];
                    for (int i = j; i < nums.length - 1; i++) {
                        nums[j] = nums[i + 1];
                        j++;
                    }
                    nums[nums.length - 1] = temp;
                } else {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }

        } else {
            Arrays.sort(nums);
        }
    }
}
