package com.ll.level0.P120849;

public class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] strToArr = my_string.split("");
        String vowels = "aeiou";
        for (String str : strToArr) {
            if(!vowels.contains(str)) {
                answer += str;
            }
        }
        return answer;
    }
}