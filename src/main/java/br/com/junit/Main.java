package br.com.junit;


import br.com.classes.*;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        double x = leitor.nextDouble();
        double y = leitor.nextDouble();

        CoordinatesOfPoint coordinatesOfPoint = new CoordinatesOfPoint(x, y);
        System.out.println(coordinatesOfPoint.returnQuadrante());
    }

}