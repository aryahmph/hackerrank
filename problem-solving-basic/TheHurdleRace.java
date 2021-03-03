package com.hackerrank;

import java.util.Arrays;

class TheHurdleRace {
    static int hurdleRace(int k, int[] height) {
        Arrays.sort(height);
        return (height[height.length - 1] > k) ? height[height.length - 1] - k : 0;
    }
}
