package tests;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Junit5Examples {
    @BeforeAll
    static void beforeAll() {
        System.out.println("== beforeAll");
    }

    @BeforeEach
    void BeforeEach() {
        System.out.println("BeforeEach");
    }

    @Test
    void firstTest() {
        System.out.println("Started test_1");
    }
    @Test
    void secondTest() {
        System.out.println("Started test_2");
        assertEquals(2,2);
    }
    @AfterAll
    static void AfterAll() {
        System.out.println("Started AfterAll");

    }


    @AfterEach
    void AfterEach() {
        System.out.println("AfterEach \n");
    }
}
