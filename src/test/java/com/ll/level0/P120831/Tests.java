package com.ll.level0.P120831;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Tests {
    @Test
    @DisplayName("10 -> 30")
    void t1() {
        assertThat(new Solution().solution(10)).isEqualTo(30);
    }
    @Test
    @DisplayName("4 -> 6")
    void t2() {
        assertThat(new Solution().solution(4)).isEqualTo(6);
    }
    @Test
    @DisplayName("15 -> 56")
    void t3() {
        assertThat(new Solution().solution(15)).isEqualTo(56);
    }
}