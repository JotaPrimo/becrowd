package br.com.junit;


import br.com.classes.*;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int hora_inicio = leitor.nextInt();
        int hora_fim = leitor.nextInt();

        GameTime gameTime = new GameTime(hora_inicio, hora_fim);
        System.out.print(gameTime.processar());
    }

}