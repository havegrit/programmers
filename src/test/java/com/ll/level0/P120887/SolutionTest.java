package com.ll.level0.P120887;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {
    @Test
    @DisplayName("1, 13, 1 => 6")
    void t1() {
        assertThat(new Solution().solution(1, 13, 1)).isEqualTo(6);
    }
}