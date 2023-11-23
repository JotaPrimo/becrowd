package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class BanknoteTest {
    static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {576, "576\n" +
                        "5 nota(s) de R$ 100,00\n" +
                        "1 nota(s) de R$ 50,00\n" +
                        "1 nota(s) de R$ 20,00\n" +
                        "0 nota(s) de R$ 10,00\n" +
                        "1 nota(s) de R$ 5,00\n" +
                        "0 nota(s) de R$ 2,00\n" +
                        "1 nota(s) de R$ 1,00"},
                {11257, "11257\n" +
                        "112 nota(s) de R$ 100,00\n" +
                        "1 nota(s) de R$ 50,00\n" +
                        "0 nota(s) de R$ 20,00\n" +
                        "0 nota(s) de R$ 10,00\n" +
                        "1 nota(s) de R$ 5,00\n" +
                        "1 nota(s) de R$ 2,00\n" +
                        "0 nota(s) de R$ 1,00"},
                {503, "503\n" +
                        "5 nota(s) de R$ 100,00\n" +
                        "0 nota(s) de R$ 50,00\n" +
                        "0 nota(s) de R$ 20,00\n" +
                        "0 nota(s) de R$ 10,00\n" +
                        "0 nota(s) de R$ 5,00\n" +
                        "1 nota(s) de R$ 2,00\n" +
                        "1 nota(s) de R$ 1,00"},
        });
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void its_should_be_same(int valor, String resultExpected) {
        // cenario
        Banknote banknote = new Banknote(valor);

        // ação
        String resultadoObetido = banknote.returnResultado();

        // asserção
        Assert.assertEquals(resultExpected, resultadoObetido);
    }
}