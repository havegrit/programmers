package com.ll.level0.P120896;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String s) {
        for (int i = 0; i < s.length()-1; i++) {
            System.out.println(s.substring(i + 1, s.length()));
            System.out.println(s.subSequence(i, i + 1));
            if (s.substring(i + 1, s.length()).contains(s.subSequence(i,i+1))) {

                s = s.replaceAll(Character.toString(s.charAt(i)), " ");
            }
        }
        s = Arrays.stream(s.replaceAll(" ", "")
                .split(""))
                .sorted()
                .collect(Collectors.joining());
        return s;
    }
}