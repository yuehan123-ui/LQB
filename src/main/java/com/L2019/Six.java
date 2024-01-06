package com.L2019;

import java.util.Scanner;

public class Six {
    //小明对数位中含有 2、0、1、9 的数字很感兴趣（不包括前导 0），在 1 到 40 中这样的数包括 1、2、9、10 至 32、39 和 40，共 28 个，他们的和是 574。
    //
    //请问，在 1 到 n 中，所有这样的数的和是多少？

/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for (int i = 1; i <=n; i++) {
            if (!judge(i)){
                result +=i;
            }
        }
        System.out.println(result);

    }
    public static boolean judge(int num){
        while(num > 0){
            int n = num%10;
            if (n==2||n==0||n==1||n==9){
                return false;
            }
            num = num / 10;
        }
        return true;
    }*/
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = 0;
    for (int i = 1; i <=n ; i++) {
        String j = String.valueOf(i); //将整型变为字符串形式
        if (j.contains("2")||j.contains("0")||j.contains("1")||j.contains("9")){
            // String字符串中contain方法检测字符串中是否包含目标字符
            result += i;
        }
    }
    System.out.println(result);
}
}
