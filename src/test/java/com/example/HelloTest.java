package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class HelloTest {

    @Test
    void testSayHello() {
        Hello hello = new Hello();
        assertDoesNotThrow(() -> hello.sayHello("JUnit"));
    }
}
