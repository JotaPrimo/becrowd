package br.com.classes;

import br.com.utils.FormatadorNumeros;

public class AverageOne {
    private final double PESO_A = 3.5F;
    private final double PESO_B = 7.5F;
    private double A;
    private double B;

    public AverageOne(double a, double b) {
        A = FormatadorNumeros.duasCasasDecimaisComPonto(a);
        B = FormatadorNumeros.duasCasasDecimaisComPonto(b);
    }

    public double calcular( ) {
        double somaPessos = PESO_A + PESO_B;
        double resultado = ((A * PESO_A) + (B * PESO_B)) / somaPessos;
        return Double.parseDouble(FormatadorNumeros.cincoCasasDecimaisComPonto(resultado));
    }

    public static void verificarNumeroValido(double numero) {
        if (numero > 10 || numero < 0) {
            throw new RuntimeException("Notas devem ser entre 0 e 10");
        }
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
}
