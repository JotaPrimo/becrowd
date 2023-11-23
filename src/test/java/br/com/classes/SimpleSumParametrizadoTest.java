package br.com.classes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SimpleSumParametrizadoTest {
    // Método que fornece os dados de teste

    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {30, 10, "SOMA = 40\n"},
                {-30, 10, "SOMA = -20\n"},
                {0, 0, "SOMA = 0\n"}
        });
    }

    // Teste real que usa os parâmetros fornecidos
    @ParameterizedTest
    @MethodSource("data")
    public void testSoma(int A, int B, String resultadoEsperado) {

        // cenario
        SimpleSum simpleSum = new SimpleSum(A, B);

        // acão
        String resultadoConcatenado = simpleSum.getSomaFmt();

        // verificacao
        assertEquals(resultadoEsperado, resultadoConcatenado);
    }
}