package com.ztbu;

import java.util.Scanner;

public class Card {
    //卡片问题
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arrs = new int[10000];
        arrs[1] = 1;
        int n = sc.nextInt();
        int i ;
        for (i = 2; i < 10000; i++) {
            arrs[i] = arrs[i-1]+i;
            if (n<=arrs[i])
                break;
        }
        System.out.println(i);
    }
}
