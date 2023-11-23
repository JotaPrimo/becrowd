package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class TheGreatestTest {
    public static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {7, 14, 106, "106 eh o maior"},
                {217, 14, 6, "217 eh o maior"},
        });
    }

    @MethodSource("dataProvider")
    @ParameterizedTest
    public void its_should_be_same(int firstNumber, int secondNumber, int thirdNumber,String resultExpected) {
        // cenario
        TheGreatest theGreatest = new TheGreatest(firstNumber, secondNumber, thirdNumber);

        // ação
        String resultadoObtido = theGreatest.calcularTheGreatest();

        // assercao
        Assert.assertEquals(resultExpected, resultadoObtido);

    }
}