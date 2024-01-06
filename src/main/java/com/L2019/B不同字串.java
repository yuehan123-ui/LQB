package com.L2019;

import java.util.HashSet;
import java.util.Set;

public class B不同字串 {
    //一个字符串的非空子串是指字符串中长度至少为 1 的连续的一段字符组成的串。例如，字符串aaab 有非空子串a, b, aa, ab, aaa, aab, aaab，一共 7 个。注意在计算时，只算本质不同的串的个数。

    //请问，字符串0100110001010001 有多少个不同的非空子串？
    public static void main(String[] args) {
        //string的api  substring(a,b)  求字串 包含a不包含b
        String s = "0100110001010001";
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <=s.length() ; j++) {
                set.add(s.substring(i,j));
            }
        }
        System.out.println(set.size());
        for (String b:set) {
            System.out.println(b);
        }

    }
}
