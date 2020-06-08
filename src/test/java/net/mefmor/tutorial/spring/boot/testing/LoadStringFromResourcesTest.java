package net.mefmor.tutorial.spring.boot.testing;

import java.io.IOException;
import java.io.InputStreamReader;
import static org.assertj.core.api.Assertions.assertThat;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.util.FileCopyUtils;


class LoadStringFromResourcesTest {
    @Test
    void testLoadStringFromResourceFile() throws IOException {
        assertThat(LoadStringFromResourcesTest.asStringStatic("sample.txt"))
                .isEqualTo("File contents");
        assertThat(asString("sample.txt")).isEqualTo("File contents");
    }
    
    static String asStringStatic(String pathToResource) throws IOException {
        String s;
        try (InputStreamReader r = new InputStreamReader(LoadStringFromResourcesTest.class.getResourceAsStream(pathToResource))) {
            s = FileCopyUtils.copyToString(r);
        }
        return s;
    }

    @SneakyThrows
    private String asString(String pathToResource) {
        String s;
        try (InputStreamReader r = new InputStreamReader(this.getClass().getResourceAsStream(pathToResource))) {
            s = FileCopyUtils.copyToString(r);
        }
        return s;
    }
    
}
