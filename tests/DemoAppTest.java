package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Basic unit test for DemoApp logic.
 */
public class DemoAppTest {
    @Test
    void testGreetingLogic() {
        String name = "World";
        String expected = "Hello, World!";
        String actual = "Hello, " + name + "!";
        assertEquals(expected, actual);
    }
}
