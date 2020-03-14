package net.mefmor.tutorial.junit5;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // TestInstance.Lifecycle.PER_METHOD - by default
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ChangeLifecycleOfTest {
    private String string = "INITIAL VALUE";

    @Test
    @Order(1)
    void firstTest() {
        assertThat(string).isEqualTo("INITIAL VALUE");
        string = "VALUE 1";
    }

    @Test
    @Order(2)
    void secondTest() {
        assertThat(string).isEqualTo("VALUE 1");
        string = "VALUE 2";
    }

    @Test
    @Order(3)
    void thirdTest() {
        assertThat(string).isEqualTo("VALUE 2");
        string = "VALUE 3";
    }

    @AfterAll
    void afterAllTests() {
        assertThat(string).isEqualTo("VALUE 3");
    }
}
