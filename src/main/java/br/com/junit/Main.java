package br.com.junit;


import br.com.classes.*;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();

        TriangleType triangleType = new TriangleType(A, B, C);
        System.out.print(triangleType.calculate());
    }

}