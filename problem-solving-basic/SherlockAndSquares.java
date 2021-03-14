package com.hackerrank;

public class SherlockAndSquares {
    static int squares(int a, int b) {
        return (int) Math.sqrt(b) - (int) Math.ceil(Math.sqrt(a)) + 1;
    }
}
