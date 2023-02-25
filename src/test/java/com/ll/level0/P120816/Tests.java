package com.ll.level0.P120816;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class Tests {
    @Test
    @DisplayName("7, 10-> 2")
    void t1() {
        assertThat(new Solution().solution(7, 10)).isEqualTo(2);
    }
    @Test
    @DisplayName("4, 12 -> 3")
    void t2() {
        assertThat(new Solution().solution(4, 12)).isEqualTo(3);
    }
}