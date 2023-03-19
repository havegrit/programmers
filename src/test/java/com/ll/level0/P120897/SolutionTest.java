package com.ll.level0.P120897;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    @DisplayName("24 => {1, 2, 3, 4, 6, 8, 12, 24}")
    void t1() {
        assertThat(new Solution().solution(24)).isEqualTo(new int[]{1, 2, 3, 4, 6, 8, 12, 24});
    }
}