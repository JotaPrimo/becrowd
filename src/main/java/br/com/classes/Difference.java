package br.com.classes;

public class Difference {

    private int A;
    private int B;
    private int C;
    private int D;

    public String calculate() {
        return "DIFERENCA = " +  ((A * B) - (C * D));
    }

    public Difference(int a, int b, int c, int d) {
        A = a;
        B = b;
        C = c;
        D = d;
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

    public int getC() {
        return C;
    }

    public void setC(int c) {
        C = c;
    }

    public int getD() {
        return D;
    }

    public void setD(int d) {
        D = d;
    }
}
