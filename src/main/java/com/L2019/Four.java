package com.L2019;

public class Four {
    public static void main(String[] args) {
       //把 2019 分解成 3 个各不相同的正整数之和，并且要求每个正整数都不包含数字 2 和 4，一共有多少种不同的分解方法？
        //
        //注意交换 3 个整数的顺序被视为同一种方法，例如 1000+1001+18 和 1001+1000+18 被视为同一种。
        int n = 2019;
        int result = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i+1; j < n&&n-i-j>j; j++) {
                int k = n - i - j;
                if (!judge(i)&&!judge(j)&&!judge(k)){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
    public static boolean judge(int num){
        while (num>0){
            int n = num%10;
            if (n==2||n==4){
                return true;
            }
            num = num/10;
        }
        return false;
    }
}
