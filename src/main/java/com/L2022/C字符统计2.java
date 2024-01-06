package com.L2022;

import java.util.Scanner;

public class C字符统计2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char [] zimu ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int [] cishu = new int[26];
        int max = cishu[0];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < zimu.length; j++) {
                if (s.charAt(i)==zimu[j]) cishu[j]++;
            }
        }
        for (int i = 1; i < cishu.length; i++) {
            if (cishu[i]>max){
                max = cishu[i];
            }
        }
        for (int i = 0; i < cishu.length; i++) {
            if (cishu[i]==max) System.out.print(zimu[i]);
        }
    }
}
