package net.mefmor.tutorial.spring.boot.testing;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OrderAnnotationTests {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderAnnotationTests.class);

    @Test
    @Order(1)
    void firstTest() {
        LOGGER.info("FIRST TEST");
    }

    @Test
    @Order(2)
    void secondTest() {
        LOGGER.info("SECOND TEST");
    }

    @Test
    @Order(3)
    void thirdTest() {
        LOGGER.info("SECOND TEST");
    }
}
