package com.hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class SequenceEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();

        // Input
        int nInput = scanner.nextInt();
        int i = 1;
        while (i <= nInput) {
            map.put(scanner.nextInt(), i);
            i++;
        }

        // Logic
        i = 1;
        while (i <= nInput) {
            System.out.println(map.get(map.get(i)));
            i++;
        }

    }
}