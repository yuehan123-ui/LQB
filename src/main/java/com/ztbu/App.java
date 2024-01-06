package com.ztbu;

/**
 * 给定一个排序数组nums 和一个目标值target
 * 在nums搜索target 如果存在 输出索引值 不存在 输出应该插入位置的索引值
 */
public class App 
{
    public static int search(int [] nums,int target){
        int left = 0;
        int right  = nums.length-1;
        int mid = 0;
        int num = 0;
        while(left<=right){
            mid = left + (right-left)/2;
            num = nums[mid];
            if (num < target){
                left = mid + 1;
            }else if (num > target){
                right = mid - 1;
            }else {
               return mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int [] nums = {0,1,2,4,5,7,8,9,11};
        int target = 2;
        System.out.println(search(nums, target));
    }
}
