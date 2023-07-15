package com.evolvingweb;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.Duration;

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

        step("Check if Services menu is working", () -> {
            $(byText("Services")).hover()
                    .shouldBe(visible);

            $(byText("Our Services")).hover()
                    .shouldBe(visible);

            $(byText("Audit Services")).hover()
                    .shouldBe(visible);

            $(byText("Strategy")).hover()
                    .shouldBe(visible);

            $(byText("Design")).hover()
                    .shouldBe(visible);

            $(byText("Design")).hover()
                    .shouldBe(visible);

            $(byText("Development")).hover()
                    .shouldBe(visible);

            $(byText("Marketing")).hover()
                    .shouldBe(visible);

            $(byText("Maintenance & Support")).hover()
                    .shouldBe(visible);

            $(byText("Drupal Upgrades and Migration Services")).hover()
                    .shouldBe(visible);

            $(byText("Content Strategy & SEO")).hover()
                    .shouldBe(visible);
        });

        step("Check if Industries menu items are working", () -> {
            $(byText("Industries")).hover()
                    .shouldBe(visible);

            $(byText("All Industries")).hover()
                    .shouldBe(visible);

            $(byText("Government & Municipalities")).hover()
                    .shouldBe(visible);

            $(byText("Higher Education")).hover()
                    .shouldBe(visible);

            $(byText("Non-profits")).hover()
                    .shouldBe(visible);

            $(byText("Healthcare")).hover()
                    .shouldBe(visible);

            $(byText("Enterprise")).hover()
                    .shouldBe(visible);
        });

        step("Click on Contact us", () -> {
            $(byText("Contact")).hover()
                    .shouldBe(visible, Duration.ofSeconds(3))
                    .click();


            $("#firstname-915edc9f-d14a-4f4d-b62c-d8b34ace0e10")
                    .setValue("Vladimir");
            $("#lastname-915edc9f-d14a-4f4d-b62c-d8b34ace0e10")
                    .setValue("Borchevskiy");
            $("#email-915edc9f-d14a-4f4d-b62c-d8b34ace0e10")
                    .setValue("arsenaljkeeee10@gmail.com");
            $("#email-915edc9f-d14a-4f4d-b62c-d8b34ace0e10")
                    .setValue("+995597078392");
            $("#reason_for_contact-915edc9f-d14a-4f4d-b62c-d8b34ace0e10")
                    .selectOption("Maintenance & Support");
            $("#message-915edc9f-d14a-4f4d-b62c-d8b34ace0e10")
                    .setValue("Hello, i'm Vladimir, Quality Assurance Engineer with a demonstrated history of working in software product-based companies, and i inspired by Vivid Money, just hire me!");


        });

        sleep(50000);

    }
}



