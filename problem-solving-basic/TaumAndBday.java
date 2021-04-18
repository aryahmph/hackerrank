package com.hackerrank;

public class TaumAndBday {
    public static long taumBday(int b, int w, int bc, int wc, int z) {
        return (long)b * (long)Math.min(bc, wc + z) + (long)w * (long)Math.min(wc, bc + z);
    }
}
