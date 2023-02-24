package com.ll.level0.P120830;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int lambPrice = 12000;
        int beveragePrice = 2000;
        answer += (lambPrice*n) + (beveragePrice*(k-(n/10)));
        return answer;
    }
}