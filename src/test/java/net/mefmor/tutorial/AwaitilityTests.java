package net.mefmor.tutorial;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static java.util.concurrent.TimeUnit.MINUTES;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

@Slf4j
class AwaitilityTests {

    @Test
    @Disabled("Too long. Enable for demo")
    void waitForTwoMinutes() {
        await().atMost(1, MINUTES).pollInterval(5, SECONDS).until(() -> {
            log.info("Waiting...");
            return false;
        });
    }

    private static class MessageProducer {
        String receive() {
            return "Value";
        }
    }

    @Test
    void getResultAfterWait() {
        MessageProducer messageProducer = new MessageProducer();

        String message = await().atMost(1, MINUTES).until(messageProducer::receive, Objects::nonNull);

        assertThat(message).isEqualTo("Value");
    }
}
