package net.mefmor.tutorial.junit5;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The class demonstrates the sequence of launching test items.
 * Pay attention to the sequence, looking at the logs after launch.
 */
class DefaultSequenceTests {
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultSequenceTests.class);

    @BeforeAll
    static void runBeforeAllTests() {
        LOGGER.info("BEFORE ALL");
    }

    @BeforeEach
    void runBeforeEach() {
        LOGGER.info("BEFORE EACH");
    }

    @AfterAll
    static void runAfterAllTests() {
        LOGGER.info("AFTER ALL");
    }

    @AfterEach
    void runAfterEach() {
        LOGGER.info("AFTER EACH");
    }

    @Test
    void firstTest() {
        LOGGER.info("FIRST TEST");
    }

    @Test
    void secondTest() {
        LOGGER.info("SECOND TEST");
    }

    @Test
    void thirdTest() {
        LOGGER.info("SECOND TEST");
    }
}
