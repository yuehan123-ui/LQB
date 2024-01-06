package com.ztbu;

import java.util.Arrays;

//  轮转数组
public class a {
    public static void rotate(int[] nums, int k) {
        for(int i = 1;i<=k;i++) {
            int zero = nums[nums.length - 1];

            for(int j = 1;j<nums.length;j++){
                int num = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = num;
                if(j==nums.length-1){
                    nums[0]=zero;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] nums = {2,3,4,5,6};
        int k = 1;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
}
