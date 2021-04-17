package com.hackerrank;

public class CircularArrayRotation {
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int aLen = a.length;
        int queryLen = queries.length;
        int[] res = new int[queryLen];

        int rotate = k % aLen;

        for (int i = 0; i < queryLen; i++) {
            if (queries[i] - rotate >= 0) {
                res[i] = a[queries[i] - rotate];
            } else {
                res[i] = a[queries[i] - rotate + aLen];
            }
        }
        return res;
    }
}
