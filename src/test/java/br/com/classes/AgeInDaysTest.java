package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class AgeInDaysTest {
    static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {400, "1 ano(s)\n" +
                        "1 mes(es)\n" +
                        "5 dia(s)"},
                {800, "2 ano(s)\n" +
                        "2 mes(es)\n" +
                        "10 dia(s)"},
                {30, "0 ano(s)\n" +
                        "1 mes(es)\n" +
                        "0 dia(s)"},
        });
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void its_should_be_same(int valor, String resultExpected) {
        // cenario
        AgeInDays age = new AgeInDays(valor);

        // ação
        String resultadoObetido = age.calculate();

        // asserção
        Assert.assertEquals(resultExpected, resultadoObetido);
    }

    static Collection<Object[]> dataProviderNotEquals() {
        return Arrays.asList(new Object[][]{
                {400, "2 ano(s)\n" +
                        "1 mes(es)\n" +
                        "5 dia(s)"},
                {800, "2 ano(s)\n" +
                        "3 mes(es)\n" +
                        "10 dia(s)"},
                {30, "0 ano(s)\n" +
                        "1 mes(es)\n" +
                        "1 dia(s)"},
        });
    }
}