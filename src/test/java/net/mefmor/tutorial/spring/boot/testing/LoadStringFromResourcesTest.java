package net.mefmor.tutorial.spring.boot.testing;

import java.io.IOException;
import java.io.InputStreamReader;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.util.FileCopyUtils;


public class LoadStringFromResourcesTest {
    @Test
    void testLoadStringFromResourceFile() throws IOException {
        assertThat(asString("/sample.txt")).isEqualTo("File contents");
    }
    
    public static String asString(String pathToResource) throws IOException {
        return FileCopyUtils.copyToString(new InputStreamReader(
                LoadStringFromResourcesTest.class.getResourceAsStream(pathToResource)));
    }
    
}
