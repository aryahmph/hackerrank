package com.hackerrank;

public class LibraryFine {
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y2 > y1) {
            return 10_000;
        } else if (y2 == y1) {
            if (m2 > m1) {
                return 500 * (m2 - m1);
            } else if (m2 == m1 && d2 > d1) {
                return 15 * (d2 - d1);
            }
        }
        return 0;
    }
}
