package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class ConsumptionTest {
    static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {500, 35.0, "14.286 km/l"},
                {2254, 124.4, "18.119 km/l"},
                {4554, 464.6, "9.802 km/l"},
        });
    }
    @MethodSource("dataProvider")
    @ParameterizedTest
    public void its_should_be_equals(int distanciaTotal, double combustivelGasto,String resultExpected) {
        // cenario
        Consumption consumption = new Consumption(distanciaTotal, combustivelGasto);

        //ação
        String resultadoObtido = consumption.calculate();

        // assertion
        Assert.assertEquals(resultExpected, resultadoObtido);
    }
}