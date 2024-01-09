package br.com.classes;

import java.util.Arrays;

public class TriangleType {
    private double A;
    private double B;
    private double C;

    public TriangleType(double a, double b, double c) {
        A = a;
        B = b;
        C = c;
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }

    public double getC() {
        return C;
    }

    public void setC(double c) {
        C = c;
    }

    public String calculate() {
        String resposta = "";
        if (!isTriangulo()) {
            resposta = "NAO FORMA TRIANGULO\n";
        } else {

            if (isTrianguloObtusangulo()) {
                resposta += "TRIANGULO OBTUSANGULO\n";
            }

            if (isTrianguloAcutangulo()) {
                resposta += "TRIANGULO ACUTANGULO\n";
            }

            if (isTrianguloEquilatero()) {
                resposta += "TRIANGULO EQUILATERO\n";
            }

            if (isTrianguloRetangulo()) {
                resposta += "TRIANGULO RETANGULO\n";
            }

            if (isTrianguloIsoceles()) {
                resposta += "TRIANGULO ISOSCELES\n";
            }
        }
        return resposta;
    }

    public boolean isTriangulo() {
        boolean c_maior_a_mais_b = (getA() + getB()) > getC();
        boolean b_maior_a_mais_c = (getA() + getC()) > getB();
        boolean a_maior_b_mais_c = (getB() + getC()) > getA();

        return c_maior_a_mais_b && b_maior_a_mais_c && a_maior_b_mais_c;
    }

    public boolean isTrianguloRetangulo() {
        double[] lados = { getA(), getB(), getC() };
        Arrays.sort(lados);

        return Math.pow(lados[0], 2) + Math.pow(lados[1], 2) == Math.pow(lados[2], 2);
    }

    public boolean isTrianguloObtusangulo() {
        double[] lados = { getA(), getB(), getC() };
        Arrays.sort(lados);

        return (Math.pow(lados[0], 2) + Math.pow(lados[1], 2)) < Math.pow(lados[2], 2);
    }

    public boolean isTrianguloAcutangulo() {
        double[] lados = { getA(), getB(), getC() };
        Arrays.sort(lados);

        return (Math.pow(lados[0], 2) + Math.pow(lados[1], 2)) > Math.pow(lados[2], 2);
    }

    public boolean isTrianguloEquilatero() {

        if (getA() == getB() && getA() == getC()) {
            return true;
        }

        if (getB() == getA() && getB() == getC()) {
            return true;
        }

        if (getC() == getB() && getC() == getA()) {
            return true;
        }

        return false;
    }

    public boolean isTrianguloIsoceles() {

        if (getA() == getB() && getB() != getC()) {
            return true;
        }

        if (getA() == getC() && getA() != getB()) {
            return true;
        }

        if (getB() == getC() && getA() != getB()) {
            return true;
        }

        return false;
    }
}
