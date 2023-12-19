package br.com.classes;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class SimpleSortTest {
    public Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {7, 21, -14, "-14\n 7\n 21\n 7\n 21\n -14\n"},
                {-14, 21, 7, "-14\n 7\n 21\n -14\n 21\n 7"}
        });
    }

    public void ordenarNumeros_ordemCrescente_RetornarOrdemCrescenteOriginal(int a, int b, int c, String resultExpected) {
        // cenario
        SimpleSort simpleSort = new SimpleSort(a, b, c);

        // ação
        simpleSort.processar();

    }
}