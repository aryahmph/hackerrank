package com.hackerrank;

public class Array2D {
    static int hourglassSum(int[][] arr) {
        int total = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
                        + arr[i + 2][j + 2];

                if (sum > total) {
                    total = sum;
                }
            }
        }
        return total;
    }
}
