package com.L2022;

import java.util.Arrays;
import java.util.Scanner;

public class D最少刷题数 {
    //    小蓝老师教的编程课有 N 名学生，编号依次是 1 . . . N。第 i 号学生这学期刷题的数量是   A_{i}。
    // 对于每一名学生，请你计算他至少还要再刷多少道题，才能使得全班刷题比他多的学生数不   超过刷题比他少的学生数。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();//学生数
        int[] arr = new int[n];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            result[i] = arr[i];
        }
        Arrays.sort(arr); //排序  找出中间值
        int middle = arr[n/2];//中间值
        //判断 比中间值大的数小于比中间值小的数   中间值
        //                等于              中间值+1
        //                大于              中间值+15
        int da=0,xiao=0,sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>middle) da++;
            if (arr[i]<middle) xiao++;
        }
        if (da<xiao){
            for (int i = 0; i < result.length; i++) {
                if (result[i]<middle) sum=middle-result[i];
                 else  sum=0;
                System.out.println(sum);
            }
        } else {
            for (int i = 0; i < result.length; i++) {
                if (result[i]<middle) sum=middle+1-result[i];
               else  sum=0;
                System.out.println(sum);
            }
        }




    }
}
