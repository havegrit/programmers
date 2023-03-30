package com.ll.level0.P120842;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {
    @Test
    @DisplayName("Test")
    void t1() {
        assertThat(Arrays.stream(new Solution().solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2))).isEqualTo(new Object());
    }
}