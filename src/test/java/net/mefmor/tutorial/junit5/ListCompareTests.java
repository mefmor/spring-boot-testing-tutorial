package net.mefmor.tutorial.junit5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ListCompareTests {
    @Test
    void compareContent() {
        List<String> list = Arrays.asList("First", "Second");

        assertThat(list).containsExactly("First", "Second");
    }
}
