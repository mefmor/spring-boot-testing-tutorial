package net.mefmor.tutorial;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static java.util.concurrent.TimeUnit.MINUTES;
import static java.util.concurrent.TimeUnit.SECONDS;
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
}
