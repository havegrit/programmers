package com.ll.level0.P120899;

public class Solution {
    public int[] solution(int[] array) {
        int[] answer = {};
        int max = 0;
        int cntIndex = 0;
        for (int value : array) {
            if (value > max) {
                max = value;
                answer = new int[]{max, cntIndex++};
            }
        }
        return answer;
    }
}