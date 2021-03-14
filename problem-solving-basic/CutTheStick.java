package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class CutTheStick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Logic
        Arrays.sort(arr);
        System.out.println(size);
        for (int i = 1; i < size; i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.println(size - i);
            }
        }
    }
}
