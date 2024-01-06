package com.L2021;

import java.util.Arrays;

public class B卡片 {
    //小蓝有很多数字卡片，每张卡片上都是数字 0 到 9。
    //小蓝准备用这些卡片来拼一些数，他想从 1 开始拼出正整数，每拼一个，就保存起来，卡片就不能用来拼其它数了。
    //小蓝想知道自己能从 1 拼到多少。
    //例如，当小蓝有 30 张卡片，其中 0 到 9 各 3 张，则小蓝可以拼出 1 到 10，
    //但是拼 11 时卡片 1 已经只有一张了，不够拼出 11。
    //现在小蓝手里有 0 到 9 的卡片各 2021 张，共 20210 张，请问小蓝可以从 1 拼到多少？
    public static void main(String[] args) {
        int [] arr = new int[10];//定义一个数组来存储10张卡片的数量
        Arrays.fill(arr,2021); //Arrays的api  fill（arr,i） 用i填满arr数组中每一位
/*        for (int i = 0; i < 10; i++) {     初始2021张
            arr[i]=2021;
        }*/

        for (int i = 1; ; i++) { //从1开始往后循环 一个数字一个数字试  如果牌库中没牌 则输出上一位
            int temp = i;  //定义一个临时变量存储i   一位一位判断
            while(temp>0){
                int n = temp%10; //从个位开始 一位一位判断牌库里是否存在当前数字的牌
                if (arr[n]>0){ // 如果大于0则还有卡片
                    arr[n]--; //  卡片-1
                }else {
                    System.out.println(i-1);
                    return; //退出循环
                }
                temp = temp / 10;
            }
        }
    }
}
