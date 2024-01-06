package com.ztbu;

import java.util.Scanner;

public class LCS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = i;
        }
        while (m-- > 0) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            for (int i = l, j = r; i < j; i++, j--) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
