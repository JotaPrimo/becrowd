package br.com.junit;


import br.com.classes.Distance;
import br.com.classes.FuelSpent;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int tempoGasto = leitor.nextInt();
        int velocidadeMedia = leitor.nextInt();

        FuelSpent fuelSpent = new FuelSpent(tempoGasto, velocidadeMedia);

        System.out.println(fuelSpent.calculateGastoCombustivel());
    }

}