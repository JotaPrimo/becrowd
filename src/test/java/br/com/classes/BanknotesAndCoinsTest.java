package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class BanknotesAndCoinsTest {
    static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {576.73F,
                        "NOTAS:\n"
                                + "5 nota(s) de R$ 100.00\n"
                                + "1 nota(s) de R$ 50.00\n"
                                + "1 nota(s) de R$ 20.00\n"
                                + "0 nota(s) de R$ 10.00\n"
                                + "1 nota(s) de R$ 5.00\n"
                                + "0 nota(s) de R$ 2.00\n"
                                + "MOEDAS:\n"
                                + "1 moeda(s) de R$ 1.00\n"
                                + "1 moeda(s) de R$ 0.50\n"
                                + "0 moeda(s) de R$ 0.25\n"
                                + "2 moeda(s) de R$ 0.10\n"
                                + "0 moeda(s) de R$ 0.05\n"
                                + "3 moeda(s) de R$ 0.01"
                },
                {
                        4.00F,
                        "NOTAS:\n"
                                + "0 nota(s) de R$ 100.00\n"
                                + "0 nota(s) de R$ 50.00\n"
                                + "0 nota(s) de R$ 20.00\n"
                                + "0 nota(s) de R$ 10.00\n"
                                + "0 nota(s) de R$ 5.00\n"
                                + "2 nota(s) de R$ 2.00\n"
                                + "MOEDAS:\n"
                                + "0 moeda(s) de R$ 1.00\n"
                                + "0 moeda(s) de R$ 0.50\n"
                                + "0 moeda(s) de R$ 0.25\n"
                                + "0 moeda(s) de R$ 0.10\n"
                                + "0 moeda(s) de R$ 0.05\n"
                                + "0 moeda(s) de R$ 0.01"
                },
                {
                        91.01F,
                        "NOTAS:\n"
                                + "0 nota(s) de R$ 100.00\n"
                                + "1 nota(s) de R$ 50.00\n"
                                + "2 nota(s) de R$ 20.00\n"
                                + "0 nota(s) de R$ 10.00\n"
                                + "0 nota(s) de R$ 5.00\n"
                                + "0 nota(s) de R$ 2.00\n"
                                + "MOEDAS:\n"
                                + "1 moeda(s) de R$ 1.00\n"
                                + "0 moeda(s) de R$ 0.50\n"
                                + "0 moeda(s) de R$ 0.25\n"
                                + "0 moeda(s) de R$ 0.10\n"
                                + "0 moeda(s) de R$ 0.05\n"
                                + "1 moeda(s) de R$ 0.01"
                }
        });
    }
    @ParameterizedTest
    @MethodSource("dataProvider")
    public void test_its_should_be_equals(float valor, String resultadoEsperado) {
        // cenario
        BanknotesAndCoins banknotesAndCoins = new BanknotesAndCoins(valor);

        // ação
        String resultadoObtido = banknotesAndCoins.calculate();

        // verificação
        Assert.assertEquals(resultadoEsperado, resultadoObtido);
    }

    static Collection<Object[]> dataProviderNotEquals() {
        return Arrays.asList(new Object[][]{
                {576.85F,
                        "NOTAS:\n"
                                + "5 nota(s) de R$ 100.00\n"
                                + "1 nota(s) de R$ 50.00\n"
                                + "1 nota(s) de R$ 20.00\n"
                                + "0 nota(s) de R$ 10.00\n"
                                + "1 nota(s) de R$ 5.00\n"
                                + "0 nota(s) de R$ 2.00\n"
                                + "MOEDAS:\n"
                                + "1 moeda(s) de R$ 1.00\n"
                                + "1 moeda(s) de R$ 0.50\n"
                                + "0 moeda(s) de R$ 0.25\n"
                                + "2 moeda(s) de R$ 0.10\n"
                                + "0 moeda(s) de R$ 0.05\n"
                                + "3 moeda(s) de R$ 0.01"
                },
                {
                        4.00F,
                        "NOTAS:\n"
                                + "1 nota(s) de R$ 100.00\n"
                                + "0 nota(s) de R$ 50.00\n"
                                + "0 nota(s) de R$ 20.00\n"
                                + "0 nota(s) de R$ 10.00\n"
                                + "0 nota(s) de R$ 5.00\n"
                                + "2 nota(s) de R$ 2.00\n"
                                + "MOEDAS:\n"
                                + "0 moeda(s) de R$ 1.00\n"
                                + "0 moeda(s) de R$ 0.50\n"
                                + "0 moeda(s) de R$ 0.25\n"
                                + "0 moeda(s) de R$ 0.10\n"
                                + "0 moeda(s) de R$ 0.05\n"
                                + "0 moeda(s) de R$ 0.01"
                },
                {
                        91.01F,
                        "NOTAS:\n"
                                + "0 nota(s) de R$ 100.00\n"
                                + "1 nota(s) de R$ 50.00\n"
                                + "2 nota(s) de R$ 20.00\n"
                                + "0 nota(s) de R$ 10.00\n"
                                + "1 nota(s) de R$ 5.00\n"
                                + "0 nota(s) de R$ 2.00\n"
                                + "MOEDAS:\n"
                                + "1 moeda(s) de R$ 1.00\n"
                                + "0 moeda(s) de R$ 0.50\n"
                                + "0 moeda(s) de R$ 0.25\n"
                                + "0 moeda(s) de R$ 0.10\n"
                                + "0 moeda(s) de R$ 0.05\n"
                                + "1 moeda(s) de R$ 0.01"
                }
        });
    }

    @ParameterizedTest
    @MethodSource("dataProviderNotEquals")
    public void test_its_should_not_be_equals(float valor, String resultadoEsperado) {
        // cenario
        BanknotesAndCoins banknotesAndCoins = new BanknotesAndCoins(valor);

        // ação
        String resultadoObtido = banknotesAndCoins.calculate();

        // verificação
        Assert.assertNotEquals(resultadoEsperado, resultadoObtido);
    }

}