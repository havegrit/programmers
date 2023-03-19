package com.ll.level0.P120904;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("29183, 1 => 3")
    void t1() {
        assertThat(new Solution().solution(29183, 1)).isEqualTo(3);
    }
    @Test
    @DisplayName("232443, 4 => 4")
    void t2() {
        assertThat(new Solution().solution(232443, 4)).isEqualTo(4);
    }
    @Test
    @DisplayName("123456, 7 => -1")
    void t3() {
        assertThat(new Solution().solution(123456, 7)).isEqualTo(-1);
    }
}