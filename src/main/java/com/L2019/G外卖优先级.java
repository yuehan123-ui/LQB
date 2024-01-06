package com.L2019;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class G外卖优先级 {
    //“饱了么”外卖系统中维护着 N 家外卖店，编号 1 ∼ N。每家外卖店都有 一个优先级，初始时 (0 时刻) 优先级都为 0。
    //
    //每经过 1 个时间单位，如果外卖店没有订单，则优先级会减少 1，最低减 到 0；而如果外卖店有订单，则优先级不减反加，每有一单优先级加 2。
    //
    //如果某家外卖店某时刻优先级大于 5，则会被系统加入优先缓存中；如果 优先级小于等于 3，则会被清除出优先缓存。
    //
    //给定 T 时刻以内的 M 条订单信息，请你计算 T 时刻时有多少外卖店在优先缓存中。
    //————————————————
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<Integer>();
        int n = sc.nextInt();//店铺个数
        int m = sc.nextInt();//订单个数
        int t = sc.nextInt();//时刻
        int [] arr = new int[n];//店铺集合
        for (int i = 0; i < n; i++) {//为店铺编号
           arr[i] = i+1;
        }
        int [][] as = new int[m][2];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <=2 ; j++) {
                as[i][m]=sc.nextInt();
            }
        }


    }
}
