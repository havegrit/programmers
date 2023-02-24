package com.ll.level0.P120833;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[(num2-num1)+1];
        int j = 0;
        for (int i = num1; i <= num2; i++) {
            answer[j++] = numbers[i];
        }
        return answer;
    }
}
