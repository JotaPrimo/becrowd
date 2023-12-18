package br.com.classes;

public class Interval {
    private float numero;
    private String resultado;

    public Interval(float numero) {
        this.numero = numero;
    }

    public String calculate() {
        if (isNumeroDentroIntervalo()) {
            return "Fora de intervalo";
        }

        if (this.numero >= 0 && this.numero <= 25.000) {
            setResultado("Intervalo [0,25]\n");
        }

        if (this.numero >= 25.001 && this.numero <= 50) {
            setResultado("Intervalo (25,50]\n");
        }

        if (this.numero >= 50.0001 && this.numero <= 75) {
            setResultado("Intervalo (50,75]\n");
        }

        if (this.numero >= 75.0001 && this.numero <= 100) {
            setResultado("Intervalo (75,100]\n");
        }

        return this.getResultado();
    }

    public boolean isNumeroDentroIntervalo() {
        return this.numero < 0 || this.numero > 100;
    }

    public float getNumero() {
        return numero;
    }

    public void setNumero(float numero) {
        this.numero = numero;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
