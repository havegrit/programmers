package com.ll.level0.P120906;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        String intToStr = Integer.toString(n);
        String[] strToArr = intToStr.split("");
        for (String str : strToArr) {
            answer += Integer.parseInt(str);
        }
        return answer;
    }
}