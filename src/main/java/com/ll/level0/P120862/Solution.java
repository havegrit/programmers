package com.ll.level0.P120862;

public class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i]*numbers[j]>answer) answer = numbers[i]*numbers[j];
            }
        }
        return answer;
    }
}
