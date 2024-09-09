package com.adjectivecolournoun

import com.adjectivecolournoun.gradle.Greetz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetzTest {

    private Greetz greetz;

    @BeforeEach
    void setUp() {
        greetz = new Greetz();
    }

    @Test
    void testPerformComplexOperation() {
        // Assuming the complex operation result should be 45
        String result = greetz.performComplexOperation();
        assertEquals("Result of complex operation: 45", result, "The result of the complex operation should be 45.");
    }
}
