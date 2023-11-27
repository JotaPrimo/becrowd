package br.com.classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class BanknotesAndCoinsTest {
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {576.73, "NOTAS:\n" +
                        "5 nota(s) de R$ 100.00\n" +
                        "1 nota(s) de R$ 50.00\n" +
                        "1 nota(s) de R$ 20.00\n" +
                        "0 nota(s) de R$ 10.00\n" +
                        "1 nota(s) de R$ 5.00\n" +
                        "0 nota(s) de R$ 2.00\n" +
                        "MOEDAS:\n" +
                        "1 moeda(s) de R$ 1.00\n" +
                        "1 moeda(s) de R$ 0.50\n" +
                        "0 moeda(s) de R$ 0.25\n" +
                        "2 moeda(s) de R$ 0.10\n" +
                        "0 moeda(s) de R$ 0.05\n" +
                        "3 moeda(s) de R$ 0.01"
                },
                {
                        4.00, "NOTAS:\n" +
                        "0 nota(s) de R$ 100.00\n" +
                        "0 nota(s) de R$ 50.00\n" +
                        "0 nota(s) de R$ 20.00\n" +
                        "0 nota(s) de R$ 10.00\n" +
                        "0 nota(s) de R$ 5.00\n" +
                        "2 nota(s) de R$ 2.00\n" +
                        "MOEDAS:\n" +
                        "0 moeda(s) de R$ 1.00\n" +
                        "0 moeda(s) de R$ 0.50\n" +
                        "0 moeda(s) de R$ 0.25\n" +
                        "0 moeda(s) de R$ 0.10\n" +
                        "0 moeda(s) de R$ 0.05\n" +
                        "0 moeda(s) de R$ 0.01"
                },
                {
                        91.01, "NOTAS:\n" +
                        "0 nota(s) de R$ 100.00\n" +
                        "1 nota(s) de R$ 50.00\n" +
                        "2 nota(s) de R$ 20.00\n" +
                        "0 nota(s) de R$ 10.00\n" +
                        "0 nota(s) de R$ 5.00\n" +
                        "0 nota(s) de R$ 2.00\n" +
                        "MOEDAS:\n" +
                        "1 moeda(s) de R$ 1.00\n" +
                        "0 moeda(s) de R$ 0.50\n" +
                        "0 moeda(s) de R$ 0.25\n" +
                        "0 moeda(s) de R$ 0.10\n" +
                        "0 moeda(s) de R$ 0.05\n" +
                        "1 moeda(s) de R$ 0.01"
                }
        });
    }

    // Teste real que usa os parâmetros fornecidos
    @ParameterizedTest
    @MethodSource("data")
    public void testSoma(double A, String resultadoEsperado) {

        // cenario
        BanknotesAndCoins banknotesAndCoins = new BanknotesAndCoins(A);

        // acão
        String resultadoObtido = banknotesAndCoins.returnResultado();

        // verificacao
        assertEquals(resultadoEsperado, resultadoObtido);
    }
}