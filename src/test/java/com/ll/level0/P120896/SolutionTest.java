package com.ll.level0.P120896;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    @DisplayName("abcabcadc => d")
    void t1() {
        assertThat(new Solution().solution("abcabcadc")).isEqualTo("d");
    }
    @Test
    @DisplayName("abdc => abdc")
    void t2() {
        assertThat(new Solution().solution("abdc")).isEqualTo("abcd");
    }
    @Test
    @DisplayName("hello => eho")
    void t3() {
        assertThat(new Solution().solution("hello")).isEqualTo("eho");
    }
}