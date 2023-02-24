package com.ll.level0.P120830;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class Tests {
    @Test
    @DisplayName("n=10, k=3 => 124,000")
    void t1() {
        assertThat(new Solution().solution(10,3)).isEqualTo(124000);
    }
    @Test
    @DisplayName("n=64, k=6 => 768,000")
    void t2() {
        assertThat(new Solution().solution(64,6)).isEqualTo(768000);
    }
}