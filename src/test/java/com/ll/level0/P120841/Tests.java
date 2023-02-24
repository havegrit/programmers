package com.ll.level0.P120841;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("x좌표 2, y좌표 4 이면 제1사분면에 속해야한다")
    void t1() {
        assertThat(new Solution().solution(new int[]{2,4})).isEqualTo(1);
    }
    @Test
    @DisplayName("x좌표 -2, y좌표 4 이면 제2사분면에 속해야한다")
    void t2() {
        assertThat(new Solution().solution(new int[]{-2,4})).isEqualTo(2);
    }
    @Test
    @DisplayName("x좌표 -2, y좌표 -4 이면 제3사분면에 속해야한다")
    void t3() {
        assertThat(new Solution().solution(new int[]{-2,-4})).isEqualTo(3);
    }
    @Test
    @DisplayName("x좌표 2, y좌표 -4 이면 제4사분면에 속해야한다")
    void t4() {
        assertThat(new Solution().solution(new int[]{2,-4})).isEqualTo(4);
    }

}