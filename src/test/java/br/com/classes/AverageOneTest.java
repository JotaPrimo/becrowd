package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

class AverageOneTest {

    public static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {5.0, 7.1, "MEDIA = 6.43182"},
                {0.0, 7.1, "MEDIA = 4.84091"},
                {10.0, 10.0, "MEDIA = 10.00000"},
        });
    }


    @MethodSource("dataProvider")
    @ParameterizedTest
    public void its_should_be_same(double firstNumber, double secondNumber, String resultExpected) {
        // cenario
        AverageOne averageOne = new AverageOne(firstNumber, secondNumber);

        // ação
        double resultadoObtido = averageOne.calcular();

        // assercao
        Assert.assertEquals(resultExpected, "MEDIA = " + resultadoObtido);

    }

}