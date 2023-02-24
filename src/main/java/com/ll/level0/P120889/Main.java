package com.ll.level0.P120889;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int longestSide = 0;
        if(sides[longestSide]<sides[1]) longestSide = 1;
        if(sides[longestSide]<sides[2]) longestSide = 2;

        switch (longestSide) {
            case 0 -> {
                if (sides[0] < sides[1] + sides[2]) {
                    answer = 1;
                } else {
                    answer = 2;
                }
            }
            case 1 -> {
                if (sides[1] < sides[0] + sides[2]) {
                    answer = 1;
                } else {
                    answer = 2;
                }
            }
            case 2 -> {
                if (sides[2] < sides[1] + sides[0]) {
                    answer = 1;
                } else {
                    answer = 2;
                }
            }
        }
        return answer;
    }
}
