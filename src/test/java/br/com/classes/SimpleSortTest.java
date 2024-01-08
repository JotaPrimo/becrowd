package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class SimpleSortTest {
    public static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {7, 21, -14, "-14\n 7\n 21\n 7\n 21\n -14\n"},
                {-14, 21, 7, "-14\n 7\n 21\n -14\n 21\n 7\n"}
        });
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void testDeveSerIgual(int a, int b, int c, String resultadoEsperado) {
        // cenario
        SimpleSort simpleSort = new SimpleSort(a, b, c);

        // acao
        String resultadoObtido = simpleSort.processar();

        // assercao
        Assert.assertEquals(resultadoEsperado, resultadoObtido);
    }

}