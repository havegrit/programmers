package com.ll.level0.P120813;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Tests {
    @Test
    @DisplayName("10 -> [1, 3, 5, 7, 9]")
    void t1() {
        assertThat(new Solution().solution(10)).isEqualTo(new int[]{1, 3, 5, 7, 9});
    }
    @Test
    @DisplayName("15 -> [1, 3, 5, 7, 9, 11, 13, 15]")
    void t2() {
        assertThat(new Solution().solution(15)).isEqualTo(new int[]{1, 3, 5, 7, 9, 11, 13, 15});
    }


}