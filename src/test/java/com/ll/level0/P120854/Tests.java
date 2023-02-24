package com.ll.level0.P120854;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class Tests {

    @Test
    @DisplayName("We, are, the, world! -> 2,3,3,6")
    void t1() {
        assertThat(new Solution().solution(new String[]{"We", "are", "the", "world!"})).isEqualTo(new int[]{2,3,3,6});
    }

    @Test
    @DisplayName("I, Love, Programmers. -> 1,4,12")
    void t2() {
        assertThat(new Solution().solution(new String[]{"I", "Love", "Programmers."})).isEqualTo(new int[]{1,4,12});
    }
}