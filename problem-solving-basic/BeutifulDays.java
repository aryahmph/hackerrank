package com.hackerrank;

class BeutifulDays {
    public static void main(String[] args) {
        System.out.println(beautifulDays(20, 23, 6));
    }

    static int beautifulDays(int i, int j, int k) {
        int count = 0;
        while (i <= j) {
            if (Math.abs(i - reverseInteger(i)) % k == 0)
                count++;
            i++;
        }
        return count;
    }

    private static int reverseInteger(int number) {
        int lastDigit = 0, reverse = 0;
        while (number > 0) {
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        return reverse;
    }
}
