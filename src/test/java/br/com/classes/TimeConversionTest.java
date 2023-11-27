package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class TimeConversionTest {
    static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {556, "0:9:16"},
                {1, "0:0:1"},
                {140153, "38:55:53"},
        });
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void its_should_be_same(int valor, String resultExpected) {
        // cenario
        TimeConversion timeConversion = new TimeConversion(valor);

        // ação
        String resultadoObetido = timeConversion.calculate();

        // asserção
        Assert.assertEquals(resultExpected, resultadoObetido);
    }

    static Collection<Object[]> dataProviderNotEquals() {
        return Arrays.asList(new Object[][]{
                {556, "0:9:17"},
                {1, "0:0:2"},
                {140153, "39:55:53"},
        });
    }


    @ParameterizedTest
    @MethodSource("dataProviderNotEquals")
    public void nao_pode_ser_igual(int valor, String resultExpected) {
        // cenario
        TimeConversion timeConversion = new TimeConversion(valor);

        // ação
        String resultadoObetido = timeConversion.calculate();

        // asserção
        Assert.assertNotEquals(resultExpected, resultadoObetido);
    }

}