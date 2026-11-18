package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void testWelcomeMessage() {
        assertEquals("Welcome to Student Management System", App.welcomeMessage());
    }
}
