package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class PickingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arrList = new ArrayList<>(n);

        int i = 0;
        while (i < n) {
            arrList.add(scanner.nextInt());
            i++;
        }
        System.out.println(pickingNumbers(arrList));
    }

    public static int pickingNumbers(List<Integer> a) {
        int aLen = a.size();
        Collections.sort(a);

        if (a.get(0).equals(a.get(aLen - 1)))
            return aLen;

        int maxCount = 0;

        // Linear Search, O(n)
        int minNumb = a.get(0);
        int count = 1;
        for (int i = 0; i < aLen - 1; i++) {
            if (Math.abs(a.get(i + 1) - minNumb) <= 1) {
                count++;
            } else {
                minNumb = a.get(i + 1);
                if (count > maxCount)
                    maxCount = count;

                count = 1;
            }
        }
        if (count > maxCount)
            maxCount = count;
        return maxCount;
    }
}
