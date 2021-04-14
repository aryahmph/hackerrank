package com.hackerrank;

public class RepeatedString {
    static long repeatedString(String s, long n) {
        // Check if theres only "a"
        if (s.length() == 1 && s.equals("a")) {
            return n;
        }

        long count = 0;
        long lenS = s.length();

        // Get a in string
        for (int i = 0; i < lenS; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }

        count *= (n / lenS);
        long remainder = n % lenS;

        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }
}
