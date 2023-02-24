package com.ll.level0.P120817;

public class Main {
    public static void main(String[] args) {

    }

}
class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        double answer = 0;
        for(int num:numbers) {
            sum+=num;
        }
        answer = sum/numbers.length;
        return answer;
    }
}
