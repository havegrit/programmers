package com.ll.level0.P120833;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("[1, 2, 3, 4, 5], 1, 3 -> [2, 3, 4]")
    void t1() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5}, 1, 3)).isEqualTo(new int[]{2, 3, 4});
    }
    @Test
    @DisplayName("[1, 3, 5], 1, 2 -> [3, 5]")
    void t2() {
        assertThat(new Solution().solution(new int[]{1, 3, 5}, 1, 2)).isEqualTo(new int[]{3, 5});
    }
}