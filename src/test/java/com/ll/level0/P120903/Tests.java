package com.ll.level0.P120903;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class Tests {
    @Test
    @DisplayName("[a, b, c], [com, b, d, p, c] => 2")
    void t1() {
        assertThat(new Solution().solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"})).isEqualTo(2);
    }
    @Test
    @DisplayName("[n, omg], [m, dot] => 0")
    void t2() {
        assertThat(new Solution().solution(new String[]{"n", "omg"}, new String[]{"m", "dot"})).isEqualTo(0);
    }
}