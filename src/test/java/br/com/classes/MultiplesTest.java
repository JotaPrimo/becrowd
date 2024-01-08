package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesTest {
    static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {6, 24, "Sao Multiplos"},
                {6, 25, "Nao sao Multiplos"},
                {3, 18, "Sao Multiplos"},
        });
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void test_deve_ser_igual(int A, int B, String resultadoEsperado) {
        // cenario
        Multiples multiples = new Multiples(A, B);

        // ação
        String resultadoObtido = multiples.calculate();

        // assercao
        Assert.assertEquals(resultadoEsperado, resultadoObtido);
    }
}