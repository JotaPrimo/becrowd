package br.com.classes;

public class SelectionTestOne {
    private int A;
    private int B;
    private int C;
    private int D;

    public SelectionTestOne(int a, int b, int c, int d) {
        A = a;
        B = b;
        C = c;
        D = d;
    }

    public String calculate() {
        boolean b_maior_c_e_d_maior_a = (B > C) && (D > A);
        boolean c_mais_d_maior_a_mais_b = (C + D) > (A + B);
        boolean c_d_positivos_e_a_par = (C >= 1 && D >= 1) && (A % 2 == 0);

        if (b_maior_c_e_d_maior_a && c_mais_d_maior_a_mais_b && c_d_positivos_e_a_par) {
            return "Valores aceitos";
        } else {
            return "Valores nao aceitos";
        }
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
