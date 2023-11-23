package br.com.classes;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ParametersTest {

    private String input;
    private int expectedLength;

    public ParametersTest(String input, int expectedLength) {
        this.input = input;
        this.expectedLength = expectedLength;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {"hello", 4},
                {"world", 5},
                {"JUnit", 5},
                {"test", 4}
        });
    }

    @Test
    public void testStringLength() {
        assertEquals(expectedLength, input.length());
    }

}