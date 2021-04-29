package aryahmph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class HappyLadyBugsTest {

    public String happyLadybugs(String b) {
        Map<Character, Integer> map = new HashMap<>();

        for (Character c : b.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Character c : map.keySet()) {
            if (c != '_' && map.get(c) == 1) {
                return "NO";
            }
        }
        if (!map.containsKey('_')) {
//            if b[i-1]!=b[i] and b[i+1]!=b[i]
            for (int i = 1; i < b.length(); i++) {
                if (b.charAt(i - 1) != b.charAt(i) && b.charAt(i + 1) != b.charAt(i)) {
                    return "NO";
                }
            }
        }

        return "YES";
    }

    @Test
    void test1() {
        String res = happyLadybugs("RRGGBBXX");
        assertEquals("YES", res);
    }
}
