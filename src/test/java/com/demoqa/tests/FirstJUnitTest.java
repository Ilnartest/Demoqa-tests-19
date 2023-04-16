package com.demoqa.tests;

import org.junit.jupiter.api.*;

public class FirstJUnitTest {
    @BeforeAll
    static void BeforeAll() {
        System.out.println("    ###@BeforeAll");
    }
    @AfterAll
    static void AfterAll() {
        System.out.println("    ###@AfterAll");
    }

    @BeforeEach
    void BeforeEach() {
        System.out.println("    ###@BeforeEach!");
    }
    @AfterEach
    void AfterEach() {
        System.out.println("    ###@AfterEach!");
    }

    @Test
   void FirstTest() {
        Assertions.assertTrue(3>2);
        System.out.println("    ###@FirstTest!");
    }

    @Test
    void SecondTest() {
        Assertions.assertTrue(3>2);
        System.out.println("    ###@SecondTest!");
    }
}