package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesTest {
    static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {6, 24, "Sao Multiplos"},
                {6, 25, "Nao sao Multiplos"},
        });
    }

    @MethodSource("dataProvider")
    @ParameterizedTest
    public void its_should_be_equals(int A, int B, String resultExpected) {
        // cenario
        Multiples multiples = new Multiples(A, B);

        //ação
        String resultadoObtido = multiples.process();

        // assertion
        Assert.assertEquals(resultExpected, resultadoObtido);
    }

}