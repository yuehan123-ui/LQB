package com.L2021;

import java.util.Scanner;

public class F时间显示 {
    //小蓝要和朋友合作开发一个时间显示的网站。在服务器上，朋友已经获取
    //了当前的时间，用一个整数表示，值为从 1970 年 1 月 1 日 00:00:00 到当前时
    //刻经过的毫秒数。
    //现在，小蓝要在客户端显示出这个时间。小蓝不用显示出年月日，只需要
    //显示出时分秒即可，毫秒也不用显示，直接舍去即可。
    //给定一个用整数表示的时间，请将这个时间对应的时分秒输出。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long time = sc.nextLong();
        time = time/1000;
        long ss  = time%60; //秒数
        time = time/60;
        long mm = time%60;//分数
        time = time/60;
        long hh = time%24;
        System.out.println(String.format("%02d",hh)+":"+String.format("%02d",mm)+":"+String.format("%02d",ss));
        // "%02d"  输出两位 不够用0补齐
    }
}
