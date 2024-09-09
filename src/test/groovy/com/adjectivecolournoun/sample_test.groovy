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
        int result = greetz.performComplexOperation();
        assertEquals(45, result, "The result of the complex operation should be 45.");
    }
}
