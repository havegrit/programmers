package com.ll.level0.P120893;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class Tests {
    @Test
    @DisplayName("cccCCC -> CCCccc")
    void t1() {
        assertThat(new Solution().solution(new String("cccCCC"))).isEqualTo(new String("CCCccc"));
    }
    @Test
    @DisplayName("abCdEfghIJ -> ABcDeFGHij")
    void t2() {
        assertThat(new Solution().solution(new String("abCdEfghIJ"))).isEqualTo(new String("ABcDeFGHij"));
    }
}