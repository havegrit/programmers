package com.ll.level0.P120854;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for(String str:strlist) {
            int i = 0;
            answer[i++] = str.length();
        }
        return answer;
    }
}