package com.ll.level0.P120854;

public class Main {
    public static void main(String[] args) {
    }
}
class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int i = 0;
        for(String str:strlist) {
            answer[i++] = str.length();
        }
        return answer;
    }
}