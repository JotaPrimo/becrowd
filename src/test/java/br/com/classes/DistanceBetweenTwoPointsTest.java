package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class DistanceBetweenTwoPointsTest {
    static Collection<Object[]> provedorDeDados() {
        return Arrays.asList(new Object[][]{
                {1.0, 7.0, 5.0, 9.0, 4.4721},
                {-2.5, 0.4, 12.1, 7.3, 16.1484},
                {2.5, -0.4, -12.2, 7.0, 16.4575},
        });
    }

    @MethodSource("provedorDeDados")
    @ParameterizedTest
    public void its_should_be_same(double x1, double x2, double y1, double y2, double resultadoEsperado) {
        // cenario
        DistanceBetweenTwoPoints distanceBetweenTwoPoints = new DistanceBetweenTwoPoints(x1, x2, y1, y2);

        // acao
        double resultadoObtido = distanceBetweenTwoPoints.calculateDistance();
        System.out.println("Resultado obitido " + resultadoObtido);
        System.out.println("Resultado esperado " + resultadoEsperado);

        // assercao
        Assert.assertTrue(resultadoEsperado == resultadoObtido);
    }

    static Collection<Object[]> provedorDeDadosNotBeEquals() {
        return Arrays.asList(new Object[][]{
                {1.2, 7.0, 5.0, 9.0, 4.4721},
                {-2.0, 0.4, 12.1, 7.3, 16.1484},
                {2.6, -0.4, -12.2, 7.0, 16.4575},
        });
    }

    @MethodSource("provedorDeDadosNotBeEquals")
    @ParameterizedTest
    public void its_should_not_be_same(double x1, double x2, double y1, double y2, double resultadoEsperado) {
        // cenario
        DistanceBetweenTwoPoints distanceBetweenTwoPoints = new DistanceBetweenTwoPoints(x1, x2, y1, y2);

        // acao
        double resultadoObtido = distanceBetweenTwoPoints.calculateDistance();
        System.out.println("Resultado obitido " + resultadoObtido);
        System.out.println("Resultado esperado " + resultadoEsperado);

        // assercao
        Assert.assertFalse("Devem ser diferentes", resultadoEsperado == resultadoObtido);
    }

}