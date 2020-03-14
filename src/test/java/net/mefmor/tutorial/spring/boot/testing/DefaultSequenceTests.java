package net.mefmor.tutorial.spring.boot.testing;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The class demonstrates the sequence of launching test items.
 * Pay attention to the sequence, looking at the logs after launch.
 */
class DefaultSequenceTests {
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultSequenceTests.class);

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
