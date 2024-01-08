package br.com.classes;

public class Multiples {
    private int A;
    private int B;

    public Multiples(int a, int b) {
        A = a;
        B = b;
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

    public String calculate() {
        if ((getA() % getB() == 0) || (getB() % getA() == 0)) {
            return "Sao Multiplos";
        } else {
            return "Nao sao Multiplos";
        }
    }
}
