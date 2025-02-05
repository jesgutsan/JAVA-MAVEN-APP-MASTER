package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ApplicationTest {

    @Test
    public void testGetStatus() {
        Application app = new Application();
        assertEquals("OK", app.getStatus());
    }
}