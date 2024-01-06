package com.L2022;

import java.util.Scanner;

public class F最大子矩阵 {
    //小明有一个大小为 N × M 的矩阵，可以理解为一个 N 行 M 列的二维数组。
    //我们定义一个矩阵 m 的稳定度 f ( m ) 为 f ( m ) = max ( m ) − min ( m ) ，其中 max ( m )
    //表示矩阵 m 中的最大值， min ( m ) 表示矩阵 m 中的最小值。现在小明想要从这
    //个矩阵中找到一个稳定度不大于 limit 的子矩阵，同时他还希望这个子矩阵的面
    //积越大越好（面积可以理解为矩阵中元素个数）。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //矩阵行数
        int m = sc.nextInt();//矩阵列数
        int [][] arr = new int[n+1][m+1];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i =1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                arr[i][j] = sc.nextInt();
/*                max = Math.max(max,arr[i][j]);
                min = Math.min(min,arr[i][j]);*/
            }
        }
        int limit = sc.nextInt();//限制
        int fm = max-min;  //稳定度
        int s = n*m;
        // fm <=limit && (m*n)max



    }
}
