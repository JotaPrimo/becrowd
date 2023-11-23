package br.com.classes;

import org.junit.Assert;
import org.junit.Test;


public class SimpleSumTest {

    @Test
    public void deve_ser_igual() {
        //cenario
        SimpleSum simpleSum = new SimpleSum(30, 10);

        // acao
        String resultadoObtido = simpleSum.getSomaFmt();

        // Asserção
        Assert.assertEquals("SOMA = 40\n", resultadoObtido);
    }


    @Test
    public void dever_ser_igual_case_2() {
        // cenario
        SimpleSum simpleSum = new SimpleSum(-30, 10);

        // acao
        String resultadoObtido = simpleSum.getSomaFmt();

        // verificacao
        Assert.assertEquals("SOMA = -20\n", resultadoObtido);
    }

    @Test
    public void deve_ser_igual_case_3() {
        // cenario
        SimpleSum simpleSum = new SimpleSum(0, 0);

        // acao
        String resultadoObtido = simpleSum.getSomaFmt();

        // verificacao
        Assert.assertEquals("SOMA = 0\n", resultadoObtido);
    }

}