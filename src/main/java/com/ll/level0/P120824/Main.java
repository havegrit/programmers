package com.ll.level0.P120824;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer;
        int cnt = 0;
        for(int num:num_list) {
            if(num%2 == 0) cnt++;
        }
        answer = new int[]{cnt,num_list.length-cnt};
        return answer;
    }
}