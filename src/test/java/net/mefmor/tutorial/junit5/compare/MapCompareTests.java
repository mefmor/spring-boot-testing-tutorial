package net.mefmor.tutorial.junit5.compare;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.MAP;


class MapCompareTests {

    @Test
    void assertContentOfMap() {
        Map<String, String> map = new HashMap<String, String>(){{
            put("status", "OK");
            put("headers", "date=2020-06-08;message=hello;delivered=true");
        }};

        assertThat(Collections.singletonList(map)).hasSize(1)
                .element(0).asInstanceOf(MAP)
                .containsEntry("status", "OK")
                .extracting("headers").asString().contains("hello");
    }
}
