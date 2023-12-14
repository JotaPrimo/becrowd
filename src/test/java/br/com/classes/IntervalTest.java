package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class IntervalTest {
    public static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {25.01F, "Intervalo (25,50]\n"},
                {25.00F, "Intervalo [0,25]\n"},
                {100.00F, "Intervalo (75,100]\n"},
                {-25.02F, "Fora de intervalo"},
        });
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void test_its_should_be_equals(float numero, String resultadoEsperado) {
        // cenario
        Interval interval = new Interval(numero);

        // ação
        String resultadoObtido = interval.calculate();

        // assertion
        Assert.assertEquals(resultadoEsperado, resultadoObtido);
    }
}