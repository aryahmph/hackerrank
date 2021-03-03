package com.hackerrank;

import java.util.Scanner;

class DayOfProgrammer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(dayOfProgrammer(scanner.nextInt()));
    }

    private static String dayOfProgrammer(int year) {
        if (year < 1700)
            throw new NumberFormatException();

        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (year == 1918)
            daysInMonth[1] -= 13;
        else if (year > 1917 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            daysInMonth[1]++;
        } else if (year < 1918 && year % 4 == 0) {
            daysInMonth[1]++;
        }

        int sumDay = 1, i = 1;
        while (sumDay < 256) {
            if (sumDay + daysInMonth[i] < 256) {
                sumDay += daysInMonth[i];
            } else {
                break;
            }
            i++;
        }
        return (256 - sumDay) + "." + ((i < 10) ? "0" + i : i) + "." + year;
    }
}