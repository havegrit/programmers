package com.ll.level0.P120891;

public class Solution {
    public int solution(int order) {
        int answer = 0;
        for (String bit : Integer.toString(order).split("")) {
            if(!bit.equals("0") && Integer.parseInt(bit)%3 == 0) {
                answer++;
            }
        }
        return answer;
    }
}