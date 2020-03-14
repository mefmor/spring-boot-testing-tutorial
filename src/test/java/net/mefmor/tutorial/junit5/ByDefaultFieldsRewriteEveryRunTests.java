package net.mefmor.tutorial.junit5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class ByDefaultFieldsRewriteEveryRunTests {
    private String string = "INITIAL VALUE";

    @Test
    void thisTestTryToChangeValue1() {
        assertThat(string).isEqualTo("INITIAL VALUE");
        string = "VALUE 1";
    }

    @Test
    void thisTestTryToChangeValue2() {
        assertThat(string).isEqualTo("INITIAL VALUE");
        string = "VALUE 2";
    }

    @Test
    void thisTestTryToChangeValue3() {
        assertThat(string).isEqualTo("INITIAL VALUE");
        string = "VALUE 3";
    }
}
