package com.ll.level0.P120831;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i += 2) {
            answer+=i;
        }
        return answer;
    }
}