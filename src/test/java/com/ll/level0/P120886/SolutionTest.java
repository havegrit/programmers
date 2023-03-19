package com.ll.level0.P120886;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {
    @Test
    @DisplayName("olleh, hello => 1")
    void t1() {
        assertThat(new Solution().solution("olleh","hello")).isEqualTo(1);
    }
    @Test
    @DisplayName("allpe, apple	=> 0")
    void t2() {
        assertThat(new Solution().solution("allpe","apple")).isEqualTo(0);
    }
}