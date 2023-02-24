package com.ll.level0.P120824;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("[1, 2, 3, 4, 5] => [2, 3]")
    void t1() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5})).isEqualTo(new int[]{2, 3});
    }

    @Test
    @DisplayName("[1, 3, 5, 7] => [0, 4]")
    void t2() {
        assertThat(new Solution().solution(new int[]{1, 3, 5, 7})).isEqualTo(new int[]{0,4});
    }
}


