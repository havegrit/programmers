package com.ll.level0.P120818;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class Tests {
    @Test
    @DisplayName("150,000 -> 142,500")
    void t1() {
        assertThat(new Solution().solution(150000)).isEqualTo(142500);
    }
    @Test
    @DisplayName("580,000 -> 464,000")
    void t2() {
        assertThat(new Solution().solution(580000)).isEqualTo(464000);
    }
    @Test
    @DisplayName("1,000,000 -> 800,000")
    void t3() {
        assertThat(new Solution().solution(1000000)).isEqualTo(800000);
    }
    @Test
    @DisplayName("149,000 -> 149,000")
    void t4() {
        assertThat(new Solution().solution(149000)).isEqualTo(141550);
    }
    @Test
    @DisplayName("99,990 -> 99,990")
    void t5() {
        assertThat(new Solution().solution(99990)).isEqualTo(99990);
    }
    @Test
    @DisplayName("500,010 -> 400,008")
    void t6() {
        assertThat(new Solution().solution(500010)).isEqualTo(400008);
    }
    @Test
    @DisplayName("999,990-> 799,992")
    void t7() {
        assertThat(new Solution().solution(999990)).isEqualTo(799992);
    }
    @Test
    @DisplayName("499,990-> 449,991")
    void t8() {
        assertThat(new Solution().solution(499990)).isEqualTo(449991);
    }
}