package com.L2020;

public class 字符串匹配2 {
    //s字串串大 找n
    public static int findSubstring(String s, String n) {
/*        if (n.length() == 0) {
            return 0;
        }
        if (s.length() < n.length()) {
            return -1;
        }*/
        boolean[][] dp = new boolean[s.length()][n.length()];
        // 初始化动态规划表格的第一列
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == n.charAt(0)) {  //返回指定索引处的char值
                dp[i][0] = true;
            }
        }
        // 填充动态规划表格的其余部分
        for (int i = 1; i < s.length(); i++) {
            for (int j = 1; j < n.length(); j++) {
                if (s.charAt(i) == n.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }
        // 在动态规划表格中查找匹配的位置
        for (int i = 0; i < s.length(); i++) {
            if (dp[i][n.length() - 1]) {
                return i - n.length()+ 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "hello world";
        String n = "world";
        int index = findSubstring(s, n);
        System.out.println("Index: " + index);
    }
}
