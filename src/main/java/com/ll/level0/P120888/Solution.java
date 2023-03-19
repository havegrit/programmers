package com.ll.level0.P120888;


import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String my_string) {
        return Arrays.stream(my_string.split("")).distinct().collect(Collectors.joining(""));
    }
}