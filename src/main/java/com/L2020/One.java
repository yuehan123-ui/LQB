package com.L2020;

public class One {
    //小蓝要为一条街的住户制作门牌号。
    //这条街一共有 2020 位住户，门牌号从 1 到 2020 编号。
    //小蓝制作门牌的方法是先制作 0 到 9 这几个数字字符，最后根据需要将字
    //符粘贴到门牌上，例如门牌 1017 需要依次粘贴字符 1、 0、 1、 7，即需要 1 个
    //字符 0， 2 个字符 1， 1 个字符 7。
    //请问要制作所有的 1 到 2020 号门牌，总共需要多少个字符 2？
    public static void main(String[] args) {
        int n = 2020;
        int result = 1;
        for (int i = 12; i <=n ; i++) {
            result+=judge(i);
        }
        System.out.println(result);
    }
    public static int judge(int num){
        int result = 0;
        while(num>0){
            int n = num%10;
            if (n==2){
                result++;
            }
            num = num / 10;
        }
        return result;
    }
}
