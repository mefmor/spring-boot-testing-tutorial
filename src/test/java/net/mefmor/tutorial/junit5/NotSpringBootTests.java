package net.mefmor.tutorial.junit5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NotSpringBootTests {
    @Test
    void testSample() {
        assertThat(true).isTrue();
    }
}
