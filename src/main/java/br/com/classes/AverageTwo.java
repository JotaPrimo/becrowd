package br.com.classes;

import br.com.utils.FormatadorNumeros;

public class AverageTwo   {

    private final double PESO_A = 2;
    private final double PESO_B = 3;
    private final double PESO_C = 5;

    private double A;
    private double B;
    private double C;

    public AverageTwo(double a, double b, double c) {
        A = validarNumero(a);
        B = validarNumero(b);
        C = validarNumero(c);
    }

    public  String calcularMedia() {
        double somaDasNotas = (A * PESO_A) + (B * PESO_B) + (C * PESO_C);
        double somaPesos = (PESO_A + PESO_B + PESO_C);
        double mediaPonderada = somaDasNotas / somaPesos;
        return "MEDIA = " + FormatadorNumeros.umaCasaDecimailComPonto(mediaPonderada);
    }

    public static double validarNumero(double numero) {
        if (numero > 10 || numero < 0) {
            throw new RuntimeException("Número deve ser maior que 10 e menor que 0");
        }
        return FormatadorNumeros.umaCasaDecimailComPonto(numero);
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
}
