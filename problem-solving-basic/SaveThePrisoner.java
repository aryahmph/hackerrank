package com.hackerrank;

import java.util.Scanner;

public class SaveThePrisoner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n_case = scanner.nextInt();

        int n_prisoners, candles, start;

        while (n_case > 0) {
            n_prisoners = scanner.nextInt();
            candles = scanner.nextInt();
            start = scanner.nextInt();

            System.out.println((start - 1 + candles - 1) % n_prisoners + 1);
            n_case--;
        }
    }
}