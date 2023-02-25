package com.ll.level0.P120816;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int solution(int slice, int n) {
        return n % slice == 0 ? n / slice : n / slice + 1;
    }
}