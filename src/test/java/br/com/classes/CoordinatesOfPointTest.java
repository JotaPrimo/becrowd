package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;


class CoordinatesOfPointTest {
    static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {4.5D, -2.2D, "Q4"},
                {0.1D, 0.1D, "Q1"},
                {0.0D, 0.0D, "Origem"}
        });
    }

    @MethodSource("dataProvider")
    @ParameterizedTest
    public void its_should_be_equals(double x, double y, String resultExpected) {
        // cenario
        CoordinatesOfPoint coordinatesOfPoint = new CoordinatesOfPoint(x, y);

        //ação
        String resultadoObtido = coordinatesOfPoint.returnQuadrante();

        // assertion
        Assert.assertEquals(resultExpected, resultadoObtido);
    }
}