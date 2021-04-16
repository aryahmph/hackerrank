package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ClimbingTheLeaderboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        int stackLen = scanner.nextInt();
        stack.push(scanner.nextInt());

        int temp = 0;
        while (stackLen > 1) {
            temp = scanner.nextInt();
            if (stack.peek() != temp) {
                stack.push(temp);
            }
            stackLen--;
        }

        int playerLen = scanner.nextInt();
        int[] player = new int[playerLen];

        for (int i = 0; i < playerLen; i++) {
            player[i] = scanner.nextInt();
        }

        int[] rank = climbingLeaderboard(stack, player);
        for (int i = 0; i < playerLen; i++) {
            System.out.println(rank[i]);
        }
    }

    private static int[] climbingLeaderboard(Stack<Integer> stack, int[] player) {
        int playerLen = player.length;
        int rankCount = stack.size();

        int[] ans = new int[playerLen];

        for (int i = 0; i < playerLen; i++) {
            if (player[i] == stack.peek()) {
                ans[i] = rankCount;
            } else if (player[i] < stack.peek()) {
                ans[i] = rankCount + 1;
            } else {
                while (rankCount > 0 && player[i] > stack.peek()) {
                    stack.pop();
                    rankCount--;
                }
                if (rankCount == 0) {
                    while (i < playerLen) {
                        ans[i] = 1;
                        i++;
                    }
                } else if (player[i] == stack.peek()) {
                    ans[i] = rankCount;
                } else {
                    ans[i] = rankCount + 1;
                }
            }
        }
        return ans;
    }
}
