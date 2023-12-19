package br.com.junit;


import br.com.classes.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

//        int a = leitor.nextInt();
//        int b = leitor.nextInt();
//        int c = leitor.nextInt();

        int a = 7;
        int b = 21;
        int c = -14;

        SimpleSort simpleSort = new SimpleSort(a, b, c);
        simpleSort.processar();
    }

}