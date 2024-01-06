package com.L2022;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C字符统计 {
    // 给定一个只包含大写字母的字符串 S ，请你输出其中出现次数最多的字母。如果有多个字   母均出现了最多次，按字母表顺序依次输出所有这些字母。
    //next() 不接受空格  nextLine() 接受空格
    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        */
        Scanner sc = new Scanner(System.in);
        String a = sc.next();//输入字符串
        char arr[] = a.toCharArray();//目标字符串
        char k[]= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int sum[]=new int[26];//存取26个字母出现的次数
        for(int i=0;i<k.length;i++) {//判断各个字母出现次数
            for(int j=0;j<arr.length;j++) {
                if(arr[j]==k[i]) {
                    sum[i]++;
                }
            }
        }
        int max=sum[0];
        for(int i=0;i<sum.length;i++) {//找出最大的数max
            if(sum[i]>max) {
                max=sum[i];
            }
        }
        for(int i=0;i<k.length;i++) {//找出次于最大的字母，可有多个
            if(sum[i]==max) {
                System.out.print(k[i]);
            }
        }


    }
}
