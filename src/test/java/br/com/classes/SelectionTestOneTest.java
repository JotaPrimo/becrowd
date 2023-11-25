package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class SelectionTestOneTest {
    static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {5, 6, 7, 8, "Valores nao aceitos"},
                {2, 3, 2, 6, "Valores aceitos"}
        });
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void testItsShouldBeEquals(int a, int b, int c, int d, String resultadoEsperado) {
        // cenario
        SelectionTestOne selectionTestOne = new SelectionTestOne(a, b, c, d);

        // acao
        String resutadoObtido = selectionTestOne.calculate();

        // assercao
        Assert.assertEquals(resultadoEsperado, resutadoObtido);
    }

    static Collection<Object[]> dataProviderNotEquals() {
        return Arrays.asList(new Object[][]{
                {5, 6, 7, 8, "Valores aceitos"},
                {2, 3, 2, 6, "Valores não aceitos"}
        });
    }

    @ParameterizedTest
    @MethodSource("dataProviderNotEquals")
    public void testItsShouldNotBeEquals(int a, int b, int c, int d, String resultadoEsperado) {
        // cenario
        SelectionTestOne selectionTestOne = new SelectionTestOne(a, b, c, d);

        // acao
        String resutadoObtido = selectionTestOne.calculate();

        // assercao
        Assert.assertNotEquals(resultadoEsperado, resutadoObtido);
    }

}