package br.com.classes;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class GameTimeTest {
    static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][]{
                {16, 2, "O JOGO DUROU 10 HORA(S)\n"},
                {0, 0, "O JOGO DUROU 24 HORA(S)\n"},
                {2, 16, "O JOGO DUROU 14 HORA(S)\n"},
        });
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void its_should_be_same(int hora_inicio, int hora_fim, String resultadoEsperado) {
        // cenario
        GameTime gameTime = new GameTime(hora_inicio, hora_fim);

        // ação
        String resultadoObtido = gameTime.processar();

        // asserção
        Assert.assertEquals(resultadoEsperado, resultadoObtido);
    }

}