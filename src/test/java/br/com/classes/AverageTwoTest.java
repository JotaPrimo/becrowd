package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

class AverageTwoTest {
    static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {5.0, 6.0, 7.0, "MEDIA = 6.3"},
                {5.0, 10.0, 10.0, "MEDIA = 9.0"},
                {10.0, 10.0, 5.0, "MEDIA = 7.5"}
        });
    }

    @MethodSource("dataProvider")
    @ParameterizedTest
    public void its_should_be_equals(double firtsNumber, double secondNumber, double thirdNumber, String resultExpected) {
        // cenario
        AverageTwo averageTwo = new AverageTwo(firtsNumber, secondNumber, thirdNumber);

        //ação
        String resultadoObtido = averageTwo.calcularMedia();

        // assertion
        Assert.assertEquals(resultExpected, resultadoObtido);
    }

}