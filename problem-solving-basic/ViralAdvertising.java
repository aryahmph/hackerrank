package com.hackerrank;

import java.util.Scanner;

class ViralAdvertising {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int day = 1, shared = 5, cumulative = 0;

        while (day <= n) {
            shared = (shared >> 1) * 3;
            cumulative += (shared / 3);
            day++;
        }
        System.out.println(cumulative);
    }
}
