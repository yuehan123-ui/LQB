package com.L2021;

import java.util.ArrayList;

public class D货物摆放 {
    public static void main(String[] args) {
        //a*b*c=n
        long n =2021041820210418L, r = (long) Math.sqrt(n);
        ArrayList <Long>arrayList = new ArrayList<Long>();
        for (long i = 1; i <= r; i++) {   //把n的所有因子存入列表中
            if (n%i==0){
                arrayList.add(i);
                long big = n/i;
                if (big!=i){
                    arrayList.add(big);
                }
            }

        }
        int sum = 0;
        for (long a:arrayList
             ) {
            for (long b:arrayList
                 ) {
                for (long c:arrayList
                     ) {
                    if (a*b*c==n){
                        sum++;
                    }
                }

            }

        }
        System.out.println(sum);
    }
}
