package com.L2020;

import org.jetbrains.annotations.NotNull;

public class 字符串匹配{
    public static int searchString(String s, String n) {
        int sLen = s.length();
        int nLen = n.length();
        // 如果s字符串长度小于n字符串长度，则无法匹配
        if (sLen < nLen)
            return -1;
        // 遍历s字符串，查找匹配的子串
        for (int i = 0; i <= sLen - nLen; i++) {
            int j;
            // 检查s字符串中以i位置开始的子串是否与n字符串匹配
            for (j = 0; j < nLen; j++) {
                if (s.charAt(i + j) != n.charAt(j))
                    break;
            }
            // 如果找到匹配的子串，则返回其起始位置
            if (j == nLen)
                return i;
        }

        // 未找到匹配的子串
        return -1;
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        String n = "cde";
        int position = searchString(s, n);
        System.out.println("s字符串："+s);
        System.out.println("n字符串: "+n);
        System.out.println("第一个匹配位置：" + position);
    }
}
