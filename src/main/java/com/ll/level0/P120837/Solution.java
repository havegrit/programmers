package com.ll.level0.P120837;

public class Solution {
    public int solution(int hp) {
        return hp/5 + (hp%5)/3 + ((hp%5)%3)/1;
    }
}