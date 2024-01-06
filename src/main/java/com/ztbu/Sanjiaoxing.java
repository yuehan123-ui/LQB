package com.ztbu;

import java.util.Scanner;

public class Sanjiaoxing {
    //数字三角形
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arrs = new int[n+1][n+1];
        for (int i = 1; i <=n ; i++) { //为二维数组赋值
            for (int j = 1; j <=i ; j++) {
                arrs[i][j]=sc.nextInt();
            }
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                arrs[i][j]=arrs[i][j]+Math.max(arrs[i-1][j-1],arrs[i-1][j]);
            }
        }
        if (n%2==0){
            System.out.println(Math.max(arrs[n][n / 2], arrs[n][n / 2 + 1]));
        }else {
            System.out.println(arrs[n][n / 2+1]);
        }
    }


/*        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            //在此输入您的代码...
            int n=scan.nextInt();//输入行数n
            int[][] arr = new int[n+1][n+1];//存储数字三角形的二维数组，n+1行n+1列
            for(int i=1;i<=n;i++){//因为是从数组下标为1开始存储，表示第一行，1到n有n个数字，一共存储n行
                for(int j=1;j<=i;j++){//每列小于等于当前列的行数，例如第二行有两列，第三行有三列
                    arr[i][j]=scan.nextInt();
                }
            }
            //求到每个数字路径的最大值，然后赋值给到这个数字
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    //按照题目的说法：路径上的每一步只能从一个数走到下一层和它最近的左边的那个数或者右边的那个数。
                    //那求最大值则是当前数字加上它上一层的左边的数字或右边的数字，就看哪边的数字大
                    //用数组描述上一层左边的数字就是当前数字的上一层前一列，上一层右边数字的话就是当前数字的上一层当前列。
                    arr[i][j]=arr[i][j]+Math.max(arr[i-1][j-1], arr[i-1][j]);
                }
            }
            if(n%2 == 0){
                //因为定义的数组是n+1行n+1列,所以行数n直接就是最后一行了
                //因为题目中说到向左下走的次数与向右下走的次数相差不能超过1。
                //意思就是无论如何我们最后到达的数字都是最后一行的中间数。
                //偶数行则必是最后一行中间两个数，看一下谁大谁小进行输出
                System.out.println(Math.max(arr[n][n/2],arr[n][n/2 + 1]));
            }else{
                //奇数行中间数就是n/2 + 1
                System.out.println(arr[n][n/2 + 1]);
            }
            scan.close();
        }*/



}

