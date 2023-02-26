package com.ll.level0.P120818;

class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int price) {
        int answer = price;
        if(price >= 500000) answer = (int)((double)price - ((double)price*0.2));
        else if (price >= 300000) {
            answer = (int)((double)price - ((double)price*0.1));
        } else if (price >= 100000) {
            answer = (int)((double)price - ((double)price*0.05));
        }
        return answer;
    }
}

