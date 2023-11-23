package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class FuelSpentTest {
    static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {10, 85, 70.833},
                {2, 92, 15.333},
                {22, 67, 122.833},
        });
    }

    @MethodSource("dataProvider")
    @ParameterizedTest
    public void its_should_not_be_equals(int tempo, int velocidadeMedia, double resultExpected) {
        // cenario
        FuelSpent fuelSpent = new FuelSpent(tempo, velocidadeMedia);

        //ação
        double resultadoObtido = fuelSpent.calculateGastoCombustivel();

        // assertion
        Assert.assertEquals(resultExpected, resultadoObtido, 0.001);
    }

    static Collection<Object[]> dataProviderNotBeEqual() {
        return Arrays.asList(new Object[][]{
                {10, 85, 70.834},
                {2, 92, 15.343},
                {22, 67, 122.853},
        });
    }

    @MethodSource("dataProviderNotBeEqual")
    @ParameterizedTest
    public void its_should_be_equals(int tempo, int velocidadeMedia, double resultExpected) {
        // cenario
        FuelSpent fuelSpent = new FuelSpent(tempo, velocidadeMedia);

        //ação
        double resultadoObtido = fuelSpent.calculateGastoCombustivel();

        // assertion
        Assert.assertNotEquals(resultExpected, resultadoObtido);
    }

}