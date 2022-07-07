package tests.tasks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static java.util.Arrays.asList;

public class ParamsTest {
    @ValueSource(strings = {"Junit5", "Junit4", "TestNG", "Selenide"})
    @ParameterizedTest(name = "При поиске в яндексе по запросу {0}")
    void yaTestCommon(String testData) {
        open("https://ya.ru/");
        $("#text").setValue(testData);
        $(".search3__button-svg").click();
        $$("li.serp-item").find(text(testData)).shouldBe(visible);
    }

    @CsvSource(value = {"Junit5, This includes focusing on Java 8 and above, as well as enabling many different styles of testing.",
            "Junit4, JUnit is a simple framework to write repeatable tests.",
            "TestNG ,TestNG is a testing framework for the, TestNG provides a number",
            "Selenide, Selenide is really nice and capable tool for writing"
    })
    @ParameterizedTest(name = "При поиске в яндексе по запросу {0}, отображается текст {1}")
    void yaTestComplex(String searchData, String expectedResult) {
        open("https://ya.ru/");
        $("#text").setValue(searchData);
        $(".search3__button-svg").click();
        $$("li.serp-item").find(text(expectedResult)).shouldBe(visible);
    }



    static Stream<Arguments> yaTestVeryComplexDataProvider() {
        return Stream.of(
                Arguments.of("Selenide", asList("Selenide", "это фреймворк для автоматизированного тестирования веб-приложений")),
                Arguments.of("Junit4", asList("Junit4", "framework"))
                );
    }

    @MethodSource(value = "yaTestVeryComplexDataProvider")
    @ParameterizedTest(name = "При поиске в яндексе по запросу {0}, отображается текст {1}")
    void yaTestVeryComplex(String searchData, List<String> expectedResult) {
        open("https://ya.ru/");
        $("#text").setValue(searchData);
        $(".search3__button-svg").click();
        for (String expRes : expectedResult) {
            $("li.serp-item").shouldHave(
                    text(expRes));
        }
    }

    @EnumSource(Sex.class)
    @ParameterizedTest(name = "При поиске в яндексе по запросу {0}")
    void sex(Sex sex) {
        open("https://ya.ru/");
        $("#text").setValue(sex.desc);
        $(".search3__button-svg").click();
        $$("li.serp-item").find(text(sex.desc)).shouldBe(visible);
    }

}