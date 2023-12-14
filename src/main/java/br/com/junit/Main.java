package br.com.junit;


import br.com.classes.BanknotesAndCoins;
import br.com.classes.Interval;
import br.com.classes.SelectionTestOne;
import br.com.classes.Snack;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float numero = leitor.nextFloat();


        Interval snack = new Interval(numero);

        System.out.println(snack.calculate());
    }

}