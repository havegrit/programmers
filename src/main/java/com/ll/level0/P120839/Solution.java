package com.ll.level0.P120839;

public class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] rspSplit = rsp.split("");
        for (String value : rspSplit) {
            switch (value) {
                case "2" -> answer += "0";
                case "0" -> answer += "5";
                case "5" -> answer += "2";
            }
        }
        return answer;
    }
}