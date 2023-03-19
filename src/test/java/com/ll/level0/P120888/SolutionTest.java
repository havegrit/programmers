package com.ll.level0.P120888;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {
    @Test
    @DisplayName("people => peol")
    void t1() {
        assertThat(new Solution().solution("people")).isEqualTo("peol");
    }

    @Test
    @DisplayName("We are the world => We arthwold")
    void t2() {
        assertThat(new Solution().solution("We are the world")).isEqualTo("We arthwold");
    }
}