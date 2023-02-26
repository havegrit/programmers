package com.ll.level0.P120826;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] my_stringSplit = my_string.split("");
        String[] letterSplit = letter.split("");
        for (int i = 0; i < letter.length(); i++) {
            for (int j = 0; j < my_string.length(); j++) {
                if(!my_stringSplit[j].equals(letterSplit[i])) answer += my_stringSplit[j];
            }
        }
        return answer;
    }
}