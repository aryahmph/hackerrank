package com.hackerrank;

class UtopianTree {
    private static int utopianTree(int n) {
        return ((1 << ((n >> 1) + 1)) - 1) << (n % 2);
    }
}
