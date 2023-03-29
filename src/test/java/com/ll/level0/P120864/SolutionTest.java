package com.ll.level0.P120864;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    @DisplayName("aAb1B2cC34oOp => 37")
    void t1() {
        assertThat(new Solution().solution("aAb1B2cC34oOp")).isEqualTo(37);
    }
    @Test
    @DisplayName("1a2b3c4d123Z => 133")
    void t2() {
        assertThat(new Solution().solution("1a2b3c4d123Z")).isEqualTo(133);
    }
    @Test
    @DisplayName("1234123 => 1234123")
    void t3() {
        assertThat(new Solution().solution("1234123")).isEqualTo(1234123);
    }
    @Test
    @DisplayName("abcd => 0")
    void t4() {
        assertThat(new Solution().solution("abcd")).isEqualTo(0);
    }
    @Test
    @DisplayName("abcd1 => 1")
    void t5() {
        assertThat(new Solution().solution("abcd1")).isEqualTo(1);
    }
}