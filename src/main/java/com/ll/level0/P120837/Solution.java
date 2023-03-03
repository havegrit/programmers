package com.ll.level0.P120837;

public class Solution {
    public int solution(int hp) {
        int generalAntATK = 5;
        int soldierAntATK = 3;
        int workerAntATK = 1;
        int generalAnt, soldierAnt, workerAnt;
        generalAnt = hp/generalAntATK;
        soldierAnt = (hp%generalAntATK)/soldierAntATK;
        workerAnt = ((hp%generalAntATK)%soldierAntATK)/workerAntATK;
        return generalAnt + soldierAnt + workerAnt;
    }
}