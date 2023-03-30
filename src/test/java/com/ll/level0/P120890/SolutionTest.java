package com.ll.level0.P120890;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {
    @Test
    @DisplayName("[3, 10, 28], 20 => 28")
    void t1() {
        assertThat(new Solution().solution(new int[]{3, 10, 28}, 20)).isEqualTo(28);
    }
    @Test
    @DisplayName("[10, 11, 12], 13 => 12")
    void t2() {
        assertThat(new Solution().solution(new int[]{10, 11, 12}, 13)).isEqualTo(12);
    }
    @Test
    @DisplayName("[12, 14], 13 => 12")
    void t3() {
        assertThat(new Solution().solution(new int[]{12, 14}, 13)).isEqualTo(12);
    }
    @Test
    @DisplayName("[14, 12], 13 => 12")
    void t4() {
        assertThat(new Solution().solution(new int[]{14, 12}, 13)).isEqualTo(12);
    }
    @Test
    @DisplayName("[10, 12, 14, 12], 13 => 12")
    void t5() {
        assertThat(new Solution().solution(new int[]{10, 12, 14, 12}, 13)).isEqualTo(12);
    }
    @Test
    @DisplayName("[10, 14, 12, 13], 13 => 13")
    void t6() {
        assertThat(new Solution().solution(new int[]{10, 14, 12, 13}, 13)).isEqualTo(13);
    }
}