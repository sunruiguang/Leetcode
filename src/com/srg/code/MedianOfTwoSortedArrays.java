package com.srg.code;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = Arrays.copyOf(nums1, nums1.length + nums2.length);
        for (int i = nums1.length; i < nums.length; i++) {
            nums[i] = nums2[nums.length - i - 1];
        }
        Arrays.sort(nums);
        int length = nums.length;
        int median = length / 2;
        double result;
        if (length % 2 == 0) {
            result = 1.0 * (nums[median - 1] + nums[median]) / 2.0;
        } else {
            result = nums[median];
        }
        return result;
    }
}
