package com.L2019;

public class Three {
    //给定数列 1, 1, 1, 3, 5, 9, 17, …，从第 4 项开始，每项都是前 3 项的和。求第 20190324 项的最后 4 位数字。
    public static void main(String[] args) {
        //求最后四位数字  只需要保留最后四位即可 %10000
        int[]arr = new int[20190324];
        arr[0]=arr[1]=arr[2]=1;
        for (int i = 3; i < 20190324; i++) {
            arr[i]=(arr[i-1]+arr[i-2]+arr[i-3])%10000;
        }
        System.out.println(arr[20190323]);
    }
}
