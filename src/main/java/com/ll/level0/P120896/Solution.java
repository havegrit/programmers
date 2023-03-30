package com.ll.level0.P120896;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String s) {
        for (int i = 0; i < s.length()-1; i++) {
            if (s.substring(i + 1, s.length() - 1).contains(s.subSequence(i,i+1))) {
                s = s.replaceAll(Character.toString(s.charAt(i)), " ");
            }
        }
        s = s.replaceAll(" ", "");
        s = Arrays.stream(s.split("")).sorted().collect(Collectors.joining());
        return s;
    }
}