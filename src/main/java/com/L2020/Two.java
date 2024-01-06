package com.L2020;

import java.util.Scanner;

public class Two {
    //小蓝有一个数字矩阵，里面只包含数字 0 和 2。小蓝很喜欢 2020，他想找
    //到这个数字矩阵中有多少个 2020 。
    //小蓝只关注三种构成 2020 的方式：
    //• 同一行里面连续四个字符从左到右构成 2020。
    //• 同一列里面连续四个字符从上到下构成 2020。
    //• 在一条从左上到右下的斜线上连续四个字符，从左上到右下构成 2020。
    //例如，对于下面的矩阵：
    //220000
    //000000
    //002202
    //000000
    //000022
    //002020
    //一共有 5 个 2020。其中 1 个是在同一行里的， 1 个是在同一列里的， 3 个
    //是斜线上的。
    //小蓝的矩阵比上面的矩阵要大，由于太大了，他只好将这个矩阵放在了一
    //个文件里面，在试题目录下有一个文件 2020.txt，里面给出了小蓝的矩阵。
    //请帮助小蓝确定在他的矩阵中有多少个 2020。
    public static void main(String[] args) {
        char a [][] = new char[6][6];
        int result = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            a[i]=sc.nextLine().toCharArray();
        }

        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j+3 <6 ; j++) {
                if (a[i][j]=='2'&&a[i][j+1]=='0'&&a[i][j+2]=='2'&&a[i][j+3]=='0'){
                    result++;
                }
            }
        }
        for (int i = 0; i +3<6 ; i++) {
            for (int j = 0; j <6 ; j++) {
                if (a[i][j]=='2'&&a[i+1][j]=='0'&&a[i+2][j]=='2'&&a[i+3][j]=='0'){
                    result++;
                }
            }
        }
        for (int i = 0; i+3 <6 ; i++) {
            for (int j = 0; j+3 <6 ; j++) {
                if (a[i][j]=='2'&&a[i+1][j+1]=='0'&&a[i+2][j+2]=='2'&&a[i+3][j+3]=='0'){
                    result++;
                }
            }
        }
        System.out.println(result);
    }

}
