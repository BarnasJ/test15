package org.zxf.abc;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class PrettyTest {

    @BeforeAll
    public static void setup() {
        System.setProperty("selenide.remote", "http://172.19.0.3:4444/wd/hub");
        System.setProperty("selenide.browser", "chrome");
    }

    @BeforeEach
    public void clearCache() {
        clearBrowserCookies();
    }

    @Test
    public void iLikeThisTest() {
        open("https://www.google.com");
        $(byId("L2AGLb")).click();
    }
}
