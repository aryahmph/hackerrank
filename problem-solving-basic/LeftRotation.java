package com.hackerrank;

public class LeftRotation {
    static int[] rotLeft(int[] a, int d) {
        int len = a.length;
        int[] ans = new int[len];

        int index = 0;
        for (int i = d; i < len; i++) {
            ans[index] = a[i];
            index++;
        }
        for (int i = 0; i < d; i++) {
            ans[index] = a[i];
            index++;
        }
        return ans;
    }
}
