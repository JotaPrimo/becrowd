package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class SnackTest {
    public static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {3, 2, "Total: R$ 10.00"},
                {4, 3, "Total: R$ 6.00"},
                {2, 3, "Total: R$ 13.50"},
        });
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void test_its_should_be_equals(int code, int quantidade, String resultadoEsperado) {
        // cenario
        Snack snack = new Snack(code, quantidade);

        // ação
        String resultadoObtido = snack.calcularPreco();

        // assertion
        Assert.assertEquals(resultadoEsperado, resultadoObtido);
    }

}