package com.ll.level0.P120825;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] splitString = my_string.split("");

        for (int j = 0; j < splitString.length; j++) {
            for (int i = n; i > 0; i--) {
                answer += splitString[j];
            }
        }
        return answer;
    }
}