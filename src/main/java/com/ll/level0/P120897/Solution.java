package com.ll.level0.P120897;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> divisor = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisor.add(i);
            }
        }
        answer = divisor.stream()
                .mapToInt(value -> value)
                .toArray();
        return answer;
    }
}