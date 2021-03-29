package com.hackerrank;

public class Encryption {
    static String encryption(String s) {
        StringBuilder sb = new StringBuilder();

        int column = (int) Math.ceil(Math.sqrt(s.length()));
        int len = s.length();

        for (int i = 0; i < column; i++) {
            for (int j = i; j < len; j += column) {
                sb.append(s.charAt(j));
            }
            sb.append(i == column - 1 ? "" : " ");
        }

        return sb.toString();
    }
}
