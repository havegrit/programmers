package com.ll.level0.P120886;

public class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        for (String bit : after.split("")) {
            if(before.contains(bit)) answer++;
        }
        return answer == after.length()?1:0;
    }
}