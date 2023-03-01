package com.ll.level0.P120836;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        outer:
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i*j == n) {
                    if(i < j) {
                        answer++;
                    } else {
                        if(i == j) {
                            answer = answer*2+1;
                        }else {
                            answer = answer*2;
                        }
                        break outer;
                    }
                }
            }
        }
        return answer;
    }
}
