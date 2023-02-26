package com.ll.level0.P120813;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n % 2 == 0 ? n / 2 : n / 2 + 1];
        int cnt = 0;
        for (int i = 1; i <= n; i += 2) {
            answer[cnt++] = i;
        }
        return answer;
    }
}