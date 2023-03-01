package com.ll.level0.P120836;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Tests {
    @Test
    @DisplayName("20 -> 6")
    void t1() {
        assertThat(new Solution().solution(20)).isEqualTo(6);
    }
    @Test
    @DisplayName("100 -> 9")
    void t2() {
        assertThat(new Solution().solution(100)).isEqualTo(9);
    }



}