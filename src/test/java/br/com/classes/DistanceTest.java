package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class DistanceTest {
    static Collection<Object[]> provedorDeDados() {
        return Arrays.asList(new Object[][]{
                {30, "60 minutos"},
                {110, "220 minutos"},
                {7, "14 minutos"},
        });
    }

    @ParameterizedTest
    @MethodSource("provedorDeDados")
    public void its_should_be_true(int valor, String resultadoEsperado) {
        // cenario
        Distance distance = new Distance(valor);

        // acao
        String resultadoObtido = distance.calculateDistance();

        // asserção
        Assert.assertEquals(resultadoEsperado, resultadoObtido);
    }

    static Collection<Object[]> provedorDeDadosNotEquals() {
        return Arrays.asList(new Object[][]{
                {30, "61 minutos"},
                {110, "221 minutos"},
                {7, "15 minutos"},
        });
    }

    @ParameterizedTest
    @MethodSource("provedorDeDadosNotEquals")
    public void its_should_not_be_true(int valor, String resultadoEsperado) {
        // cenario
        Distance distance = new Distance(valor);

        // acao
        String resultadoObtido = distance.calculateDistance();

        // asserção
        Assert.assertNotEquals(resultadoEsperado, resultadoObtido);
    }

}