package com.srg.code;

public class FlippingAnImage {

    public static void main(String[] args) {
        int[][] A = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] B = flipAndInvertImage(A);
        for (int[] i : B) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static int[][] flipAndInvertImage(int[][] A) {
        for (int[] i : A) {
            for (int j = 0; j < i.length / 2; j++) {
                swap(i, j, i.length - 1 - j);
            }
        }

        for (int[] i : A) {
            for (int j = 0; j < i.length; j++) {
                if (i[j] == 0) i[j] = 1;
                else i[j] = 0;
            }
        }
        return A;
    }

    private static void swap(int[] nums, int i, int j) {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }
}
