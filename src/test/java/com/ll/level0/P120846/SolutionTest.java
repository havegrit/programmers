package com.ll.level0.P120846;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("10 => 5")
    void t1() {
        assertThat(new Solution().solution(10)).isEqualTo(5);
    }

}