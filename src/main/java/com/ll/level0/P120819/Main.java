package com.ll.level0.P120819;

class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] solution(int money) {
        int num = money/5500;
        int change = money%5500;
        int[] answer = new int[]{num, change};
        return answer;
    }
}

