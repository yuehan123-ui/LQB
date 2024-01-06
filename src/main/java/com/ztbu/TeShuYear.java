package com.ztbu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeShuYear {

    public static void main( String[] args )
    {
        /**
         * 今年是 2021 年, 2021 这个数字非常特殊, 它的千位和十位相等, 个位比 百位大 1 ，我们称满足这样条件的年份为特殊年份。
         *
         * 输入 5 个年份, 请计算这里面有多少个特殊年份。
         *
         */
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        int number = 0,qian,bai,ge,shi;
        for (int i = 0; i < 5; i++) {
            number = scanner.nextInt();
            qian = number/1000;
            bai = number/100%10;
            shi = number/10%10;
            ge = number%10;
            if (qian==shi&&ge==bai+1)
                list.add(number);
        }

        System.out.println(list.size());

    }
}
