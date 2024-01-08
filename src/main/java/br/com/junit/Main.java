package br.com.junit;


import br.com.classes.*;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();
        int y = leitor.nextInt();

        Multiples multiples = new Multiples(x, y);
        System.out.println(multiples.calculate());
    }

}