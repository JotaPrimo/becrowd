package br.com.junit;


import br.com.classes.*;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int A = leitor.nextInt();
        int B = leitor.nextInt();

        Multiples multples = new Multiples(A, B);
        System.out.println(multples.process());
    }

}