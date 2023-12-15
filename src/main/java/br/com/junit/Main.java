package br.com.junit;


import br.com.classes.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double n1 = leitor.nextDouble();
        double n2 = leitor.nextDouble();
        double n3 = leitor.nextDouble();
        double n4 = leitor.nextDouble();

        AverageThree averageThree = new AverageThree(n1, n2, n3, n4);
        averageThree.calculateMedia();

        if (averageThree.isExame()) {
            System.out.println("Aluno em exame.");
            double notaExame = leitor.nextDouble();
            System.out.println("Nota do exame: " + notaExame);
            averageThree.calculateNotaExame(notaExame);

            if (averageThree.isAprovado()) {
                System.out.println("Aluno aprovado.");
            }

            if (averageThree.isReprovado()) {
                System.out.println("Aluno reprovado.");
            }
        } else {
            if (averageThree.isAprovado()) {
                System.out.println("Aluno aprovado.");
            }

            if (averageThree.isReprovado()) {
                System.out.println("Aluno reprovado.");
            }
        }
    }

}