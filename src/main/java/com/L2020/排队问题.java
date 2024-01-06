package com.L2020;

import java.util.ArrayList;
import java.util.List;

public class 排队问题 {
    public static void main(String[] args) {
        int[] queue = new int[10];
        List<int[]> solutions = new ArrayList<>();
        // 使用贪心算法找出所有排队方案
        findSolutions(queue, solutions, 0, 0, 0);
        // 输出所有排队方案
        for (int[] solution : solutions) {
            for (int i : solution) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    private static void findSolutions(int[] queue, List<int[]> solutions, int position, int num10, int num5) {
        // 如果已经排好了所有人，则将当前排队方案添加到结果列表中
        if (position == 10) {
            solutions.add(queue.clone());
            return;
        }
        // 当前位置的人拿10元钞票
        if (num10 < 5) {
            queue[position] = 10;
            findSolutions(queue, solutions, position + 1, num10 + 1, num5);
        }
        // 当前位置的人拿5元钞票
        if (num5 < 5) {
            queue[position] = 5;
            findSolutions(queue, solutions, position + 1, num10, num5 + 1);
        }
    }
}
