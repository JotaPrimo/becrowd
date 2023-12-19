package br.com.classes;

import java.util.ArrayList;

public class SimpleSort {
    private int a;
    private int b;
    private int c;
    private ArrayList<Integer> ordemOriginal = new ArrayList<>();
    private ArrayList<Integer> ordemCrescente = new ArrayList<>();

    public SimpleSort(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void processar() {
        salvandoOrdemOriginal();
        salvandoOrdenCrescente();

        for (int i = 0; i < this.ordemCrescente.size(); i++) {
            System.out.println(this.ordemCrescente.get(i));
        }
        System.out.println();

        for (int i = 0; i < this.ordemOriginal.size(); i++) {
            System.out.println(this.ordemOriginal.get(i));
        }
    }

    public void salvandoOrdenCrescente() {
        this.ordemCrescente.add(definirMenorNumero());
        this.ordemCrescente.add(definirMeio());
        this.ordemCrescente.add(definirMaiorNumero());
    }
    public int definirMenorNumero() {
        int menor = getA();

        if (getB() < menor) {
            menor = getB();
        }

        if (getC() < menor) {
            menor = getC();
        }
        return menor;
    }

    public int definirMaiorNumero() {
        int maior = getA();

        if (getB() > maior) {
            maior = getB();
        }

        if (getC() > maior) {
            maior = getC();
        }
        return maior;
    }

    public int definirMeio() {
        int menor = definirMenorNumero();
        int maior = definirMaiorNumero();
        int meio = 0;

        if (getA() > menor && getA() < maior) {
            meio =  getA();
        }

        if (getB() > menor && getB() < maior) {
            meio =  getB();
        }

        if (getC() > menor && getC() < maior) {
            meio =  getC();
        }

        return meio;
    }

    public void salvandoOrdemOriginal() {
        this.ordemOriginal.add(getA());
        this.ordemOriginal.add(getB());
        this.ordemOriginal.add(getC());
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
