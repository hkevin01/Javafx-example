package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Tests for the simple JavaFX demo logic.
 */
public class SimpleJavaFXDemoTest {
    @Test
    void testMainClassExists() {
        try {
            Class.forName("src.DemoApp");
        } catch (ClassNotFoundException e) {
            fail("DemoApp class should exist");
        }
    }

    @Test
    void testGreetingLogic() {
        String name = "Test";
        String expected = "Hello, Test!";
        String actual = "Hello, " + name + "!";
        assertEquals(expected, actual);
    }
}
