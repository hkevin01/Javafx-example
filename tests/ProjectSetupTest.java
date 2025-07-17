package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

/**
 * Tests for project setup and environment configuration.
 */
public class ProjectSetupTest {
    @Test
    void testJavaVersion() {
        String version = System.getProperty("java.version");
        assertTrue(version.startsWith("17") || version.startsWith("21"), "Java version should be 17 or 21");
    }

    @Test
    void testBaseStructureExists() {
        assertTrue(new File("src").exists(), "src directory should exist");
        assertTrue(new File("tests").exists(), "tests directory should exist");
        assertTrue(new File("docs").exists(), "docs directory should exist");
    }

    @Test
    void testGitignoreExists() {
        assertTrue(new File(".gitignore").exists(), ".gitignore should exist");
    }
}
