package com.L2022;

import java.util.Scanner;

public class E求阶乘 {
    //满足N!的末尾恰好有K个 0 的最小的N是多少?
    //如果这样的N不存在输出-1 。
    static long calc(long x){
        long res = 0;
        while (x!=0){
            res = res+x/5;
            x/=5;
        }
        return res;
    }
    //
    static void solve() {
        //第1部分代码
        //System.out.print(calc(10));//计算10的阶乘是不是后边有2个0
        //System.out.print(calc(25));//计算25的阶乘是不是后边有6个0

        //第2部分代码
        //System.out.print(calc(Long.MAX_VALUE/2 ));
        //Long.MAX_VALUE的阶乘后边有   2305843009213693937个0
        //Long.MAX_VALUE/2的阶乘后边有 1152921504606846964个0

        //二分查找
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextLong();
        long l = 1, r = Long.MAX_VALUE - 5;//l为最左边 r为最右边

        //long l = 1, r = 20;//方便学习可以debug
        while (l < r) {
            long mid = (l + r) / 2;
            if (k <= calc(mid)) {//如果mid的阶乘的0数大于等于k
                r = mid;//我们让r变为mid (可以等于mid)
            } else {//如果mid的阶乘的0数小于k
                l = mid + 1; //我们让l变为mid+1(大于mid,所以可以+1)
                //并且这里想让while循环中止就要不得不+1
            }
        }
        //二分法 l是最后的答案
        if (calc(r) != k) {
            System.out.println(-1);
        } else {
            System.out.println(r);
        }

    }
    public static void main(String[] args) throws Exception{
        //System.out.println((Long.MAX_VALUE + 1)/2);
        // 大于Long.MAX_VALUE 会变成负数 所以有必要改进
        solve();
    }

}
