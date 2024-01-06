package com.L2020;

import java.util.Scanner;

public class H数字三角形 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//三角形行数
        int [][] arr = new int[n+1][n+1];
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                arr[i][j] = sc.nextInt();
                arr[i][j] = arr[i][j]+Math.max(arr[i-1][j-1],arr[i-1][j]);  // 状态转移方程
            }
        }

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                arr[i][j] = arr[i][j]+Math.max(arr[i-1][j-1],arr[i-1][j]);
            }
        }
        if (n%2!=0){
            System.out.println(arr[n][n/2+1]);
        }else {
            System.out.println(Math.max(arr[n][n/2],arr[n][n/2+1]));
        }
    }
}
