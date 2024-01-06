package com.L2022;

public class B山 {
    //这天小明正在学数数。他突然发现有些正整数的形状像一座“山”，比如 12356 5321、145541，它们左右对称（回文）且数位上的数字先单调不减，后单调不增。
    //小明数了很久也没有数完，他想让你告诉他在区间 [2022, 2022222022] 中有多少个数的形状像一座“山”。
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        int result = 0;
        for (int i = 2022; i < 2022222023; i++) {
            if (isHuiWen(i)&&isDanDiao(i))
                result++;
        }
        System.out.println(result);
    }
    public static boolean isHuiWen(int num){
        String Huiwennum = ""+num;
        StringBuilder str  = new StringBuilder(Huiwennum);
        if (str.reverse().toString().equals(Huiwennum)){
            return true;
        }
        return false;

    }
    public static boolean isDanDiao(int num){
        String Huiwennum = num  + "";
        int len = Huiwennum.length()%2==0?Huiwennum.length()/2-1:Huiwennum.length()/2;
        for (int i = 0; i < len; i++) {
            if (Huiwennum.charAt(i+1)<Huiwennum.charAt(i)){
                return false;
            }
        }
        return true;



    }
}
