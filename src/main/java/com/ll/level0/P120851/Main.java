package com.ll.level0.P120851;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strToArr = my_string.split("");
        for (String str : strToArr) {
            try {
                answer += Integer.parseInt(str);
            } catch (NumberFormatException e) {
                continue;
            }
        }
        return answer;
    }
}