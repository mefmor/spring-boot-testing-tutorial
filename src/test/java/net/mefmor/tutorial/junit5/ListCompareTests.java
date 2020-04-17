package net.mefmor.tutorial.junit5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ListCompareTests {
    @Test
    void testContainsExactly() {
        List<String> list = Arrays.asList("First", "Second");

        assertThat(list).containsExactly("First", "Second");
        assertThat(list).containsOnly("First", "Second");
        assertThat(list).containsExactlyInAnyOrder("Second", "First");
        assertThat(list).containsAnyOf("Second", "Third");
    }
}
