package br.com.junit;

import br.com.classes.AgeInDays;
import br.com.classes.TimeConversion;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int dias = leitor.nextInt();

        AgeInDays ageInDays = new AgeInDays(dias);

        System.out.println(ageInDays.calculate());
    }

}