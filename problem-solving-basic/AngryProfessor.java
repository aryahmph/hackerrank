package com.hackerrank;

import java.util.Scanner;

class AngryProfessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students;

        int n_testCase = scanner.nextInt();
        int arrLen, treshold, student;

        while (n_testCase > 0) {
            students = 0;
            arrLen = scanner.nextInt();
            treshold = scanner.nextInt();

            while (arrLen > 0) {
                student = scanner.nextInt();
                if (student <= 0)
                    students++;
                arrLen--;
            }
            System.out.println((students >= treshold) ? "NO" : "YES");
            n_testCase--;
        }

    }
}
