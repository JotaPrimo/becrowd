package br.com.junit;


import br.com.classes.BanknotesAndCoins;
import br.com.classes.SelectionTestOne;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();

        SelectionTestOne selectionTestOne = new SelectionTestOne(a, b, c, d);

        System.out.println(selectionTestOne.calculate());
    }

}