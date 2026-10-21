
package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void greetingShouldBeCorrect() {
        String greeting = "My second CI build!";

        assertEquals("My second CI build!", greeting);
    }
}
