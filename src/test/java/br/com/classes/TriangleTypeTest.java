package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTypeTest {
    public static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {7.0, 5.0, 7.0, "TRIANGULO ACUTANGULO\nTRIANGULO ISOSCELES\n"},
                {6.0, 6.0, 10.0, "TRIANGULO OBTUSANGULO\nTRIANGULO ISOSCELES\n"},
                {6.0, 6.0, 6.0, "TRIANGULO ACUTANGULO\nTRIANGULO EQUILATERO\n"},
                {5.0, 7.0, 2.0, "NAO FORMA TRIANGULO\n"},
                {6.0, 8.0, 10.0, "TRIANGULO RETANGULO\n"}
        });
    }

    @MethodSource("dataProvider")
    @ParameterizedTest
    public void its_should_be_same(double A, double B, double C, String resultExpected) {
        // cenario
        TriangleType triangleType = new TriangleType(A, B, C);

        // ação
        String resultadoObtido = triangleType.calculate();

        // assercao
        Assert.assertEquals(resultExpected, resultadoObtido);
    }

}