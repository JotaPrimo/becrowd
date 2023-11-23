package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

class SimpleProductTest {

    public static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {3, 9, "PROD = 27"},
                {-30, 10, "PROD = -300"},
                {0, 9, "PROD = 0"},
        });
    }

    @MethodSource("dataProvider")
    @ParameterizedTest
    public void its_should_be_same(int firstNumber, int secondNumber, String resultExpected) {
        // cenario
        SimpleProduct simpleProduct = new SimpleProduct(firstNumber, secondNumber);

        // ação
        String resultadoObtido = simpleProduct.getResultadoFmt();

        // assercao
        Assert.assertEquals(resultExpected, resultadoObtido);

    }

}