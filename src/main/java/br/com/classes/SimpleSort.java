package br.com.classes;

import java.util.ArrayList;

public class SimpleSort {
    private int a;
    private int b;
    private int c;

    private ArrayList<String> ordemOriginal = new ArrayList<>();
    private ArrayList<String> ordemCrescente = new ArrayList<>();

    public SimpleSort(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String processar() {
        this.guardarOrdemOriginal();

        this.ordemCrescente.add(String.valueOf(retornaMenorNumero()) + "\n");
        this.ordemCrescente.add(String.valueOf(retornaNumeroMeio()) + "\n");
        this.ordemCrescente.add(String.valueOf(retornaMaiorNumero()) + "\n");

        return this.ordemCrescente + "\n" + this.ordemOriginal.toString();
    }

    public int retornaMenorNumero() {
        int menor = a;

        if (this.b < menor) {
            menor = b;
        }

        if (this.c < menor) {
            menor = c;
        }

        return menor;
    }

    public int retornaMaiorNumero() {
        int maior = a;

        if (this.b > maior) {
            maior = b;
        }

        if (this.c > maior) {
            maior = c;
        }

        return maior;
    }

    public int retornaNumeroMeio() {
        int primeiro = retornaMenorNumero();
        int ultimo = retornaMaiorNumero();

        if (primeiro < this.a && ultimo > this.a) {
            return this.a;
        }

        if (primeiro > this.b && ultimo < this.b) {
            return this.b;
        }

        if (primeiro > this.c && ultimo < this.c) {
            return this.c;
        }
        throw new RuntimeException("Deu algum erro");
    }

    public void guardarOrdemOriginal() {
        this.ordemOriginal.add(String.valueOf(this.getA()) + "\n");
        this.ordemOriginal.add(String.valueOf(this.getB()) + "\n");
        this.ordemOriginal.add(String.valueOf(this.getC()) + "\n");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
