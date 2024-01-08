package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {6.0F, 4.0F, 2.0F, "Area = 10.0"},
                {6.0F, 4.0F, 2.1F, "Perimetro = 12.1"},
        });
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void criarTriangulo_DoisCenarios_UmTrianguloOutroTrapezio(float a, float b, float c, String resultadoEsperado) {
        Triangle triangle = new Triangle(a, b, c);
        String resultdoObtido = triangle.processar();
        // Assert.assertEquals(resultadoEsperado, resultdoObtido);
        Assert.assertEquals(resultadoEsperado, resultdoObtido);
    }
}