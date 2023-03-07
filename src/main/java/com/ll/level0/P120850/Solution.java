package com.ll.level0.P120850;

import java.util.Arrays;

public class Solution {
    public int[] solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("\\D", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }
}