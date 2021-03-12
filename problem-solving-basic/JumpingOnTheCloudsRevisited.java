package com.hackerrank;

public class JumpingOnTheCloudsRevisited {
    static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int len = c.length;
        int i = 0;
        do {
            i = (i + k) % len;
            if (c[i] == 1) {
                energy -= 3;
            } else {
                energy--;
            }
        } while (i != 0);
        return energy;
    }
}
