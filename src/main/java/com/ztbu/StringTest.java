package com.ztbu;


public class StringTest {
    /**
     *
     * @param args
     * 回文数12344321 145541 1234321 判断在 【2022，2022222202】中有多少回文数
     *
     */
    public static void main(String[] args) {
        int j=0;
/*        StringBuilder stringBuilder = new StringBuilder("STRING");
        System.out.println(stringBuilder.reverse());//逆序输出字符串内容*/
        for (int i = 2022; i < 2022222023; i++) {
            if (isHuinumber(i)&&isDantiao(i)){
                j++;
            }

        }
        System.out.println(j);
    }
    public static boolean isHuinumber(int num){
        String Huinum = "" + num;
        StringBuilder stringBuilder = new StringBuilder(Huinum);
        return (stringBuilder.reverse().toString().equals(Huinum));
    }
    public static boolean isDantiao(int num){
        String Huinum = "" + num;
        int length = Huinum.length();
        char[]args = Huinum.toCharArray();//字符串的每一位分别存入数组中
        if (length%2==0){
            for (int i = 0; i < length/2-1; i++) {
                if (args[i]>args[i+1]){
                    return false;
                }
            }
            return true;
        }else{
                for (int i = 0; i < length/2 ; i++) {
                    if (args[i]>args[i+1]){
                        return false;
                    }
                }
            return true;
            }

    }}

