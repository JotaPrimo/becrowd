package br.com.classes;

public class SimpleSum {
    private int A;
    private int B;

    private int SOMA;

    public SimpleSum(int a, int b) {
        A = a;
        B = b;
        SOMA = somarAB();
    }

    public int somarAB() {

        return A + B;
    }

    public String getSomaFmt() {
        return "SOMA = " + getSOMA() + "\n";
    }

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    public int getSOMA() {
        return SOMA;
    }

    public void setSOMA(int SOMA) {
        this.SOMA = SOMA;
    }
}
