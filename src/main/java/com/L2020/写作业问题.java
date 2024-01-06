package com.L2020;

import java.util.Arrays;

import java.util.Arrays;

public class 写作业问题 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] == 0) {
                i++;
            } else {
                int j = i + 1;
                while (j < n && nums[j] == 1) {
                    j++;
                }
                if (j == n) {
                    break;
                } else {
                    nums[j] = 1;
                    nums[i] = 0;
                    i++;
                }
            }
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
