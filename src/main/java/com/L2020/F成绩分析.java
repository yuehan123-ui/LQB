package com.L2020;

import java.util.HashSet;
import java.util.Scanner;


public class F成绩分析 {
    //小蓝给学生们组织了一场考试，卷面总分为 100 分，每个学生的得分都是 一个 0 到 100 的整数。
    //
    //请计算这次考试的最高分、最低分和平均分
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//学生个数
        int max,min;
        int score = sc.nextInt();
        max = min = score;
        double sum = score;
        for (int i = 0; i < n-1; i++) {
            score = sc.nextInt();
            sum +=score;
            max = Math.max(max, score);
            min = Math.min(min,score);
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(String.format("%.2f",sum/7));


    }
}
