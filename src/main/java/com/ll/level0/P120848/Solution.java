package com.ll.level0.P120848;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 10; i > 0; i--) {
            int factorial = 1;
            for (int j = i; j > 0 ; j--) {
                factorial *= j;
                if (factorial > n) {
                    break;
                }
            }
            if (factorial <= n) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}