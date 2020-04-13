package net.mefmor.tutorial.spring.boot.testing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ValueAnnotationTest {
    @Value("${test.property.string}")
    private String stringProperty;

    @Value("${test.property.array.string}")
    private String[] stringProperties;

    @Test
    void testGetStringFromApplicationProperties() {
        assertThat(stringProperty).isEqualTo("String property value");
        assertThat(stringProperties).containsExactly("One", "Two", "Three");
    }
}
