package com.hackerrank;

import java.util.HashMap;

public class EqualizeArray {
    static int equalizeArray(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = arr.length;
        int max = 1;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
                if (map.get(arr[i]) > max) {
                    max = map.get(arr[i]);
                }
            } else {
                map.put(arr[i], 1);
            }
        }
        return len - max;
    }
}
