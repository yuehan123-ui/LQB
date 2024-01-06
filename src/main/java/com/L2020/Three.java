package com.L2020;

public class Three {
    //蛇形填数
    public static void main(String[] args) { //找规律
        int n =20;int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result + 4*(i-1);
        }
        System.out.println(result);
    }
}
