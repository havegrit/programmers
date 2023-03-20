package com.ll.level0.P120848;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    @DisplayName("3628800 => 10")
    void t1() {
        assertThat(new Solution().solution(3628800)).isEqualTo(10);
    }
}