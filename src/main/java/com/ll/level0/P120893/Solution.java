package com.ll.level0.P120893;

public class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] myStringSplit = my_string.split("");
        for (String value : myStringSplit) {
            if (Character.isUpperCase(value.charAt(0))) {
                answer += value.toLowerCase();
            } else {
                answer += value.toUpperCase();
            }
        }
        return answer;
    }
}