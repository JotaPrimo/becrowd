package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;


class DifferenceTest {
    static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {5, 6, 7, 8, "DIFERENCA = -26"},
                {0, 0, 7, 8, "DIFERENCA = -56"},
                {5, 6, -7, 8, "DIFERENCA = 86"}
        });
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void its_should_be_same(int a, int b, int c, int d, String resultadoEsperado) {
        // cenario
        Difference difference = new Difference(a, b, c, d);

        // ação
        String resultadoObtido = difference.calculate();

        // asserção
        Assert.assertEquals(resultadoEsperado, resultadoObtido);
    }

}