package net.mefmor.tutorial.spring.boot.testing.web;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class HtmlUnitTests {
    private static HtmlUnitDriver browser;

    @BeforeAll
    static void setup() {
        browser = new HtmlUnitDriver();

        browser.manage().timeouts()
                .implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterAll
    static void teardown() {
        browser.quit();
    }

    @Test
    void testHomePage(@LocalServerPort int port) {
        String homePage = "http://localhost:" + port;
        System.out.println(homePage);
        browser.get(homePage);

        assertThat(browser.getTitle()).isEqualTo("Spring Boot Tutorial");
        assertThat(browser.findElementByTagName("h1").getText()).isEqualTo("Welcome to...");

        String imgSrc = browser.findElementByTagName("img").getAttribute("src");
        assertThat(imgSrc).isEqualTo(homePage + "/images/TacoCloud.png");
    }

}
