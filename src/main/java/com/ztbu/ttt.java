package com.ztbu;

import java.util.Arrays;
import java.util.Scanner;

import java.util.*;

public class ttt {
    public static void main(String[] args) {
        int[][] triangle = {
                {5},
                {9, 6},
                {4, 6, 8},
                {0, 7, 1, 5}
        };


        System.out.println(maxTotal(triangle));
    }

    private static int maxTotal(int[][] triangle) {
        int n = triangle.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = triangle[n-1][i];
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = Math.max(dp[j], dp[j+1]) + triangle[i][j];
            }
        }
        return dp[0];
    }
}
