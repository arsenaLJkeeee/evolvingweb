package com.evolvingweb;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class EvolvingWebTests extends EvolvingWebTestBase{
    @Tag("remote")
    @Test
    void smokeEvolvingWebMainPageTest() {


        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Open main page", () -> open(baseUrl));
        step("Check if About menu is working", () -> {
            $(byText("About")).hover()
                    .shouldBe(visible);
        });

        step("Check if About menu items are working", () -> {
            $(byText("Meet Evolving Web")).hover()
                    .shouldBe(visible);

            $(byText("Careers")).hover()
                    .shouldBe(visible);

            $(byText("Why Drupal?")).hover()
                    .shouldBe(visible);

            $(byText("WordPress Web Development")).hover()
                    .shouldBe(visible);

            $(byText("Our Partners")).hover()
                    .shouldBe(visible);
        });

        sleep(5000);

    }
}



