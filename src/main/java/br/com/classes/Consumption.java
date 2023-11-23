package br.com.classes;

import br.com.utils.FormatadorNumeros;

public class Consumption {
    private int distancia_total;
    private double total_combustivel;

    public Consumption(int distancia_total, double total_combustivel) {
        this.distancia_total = distancia_total;
        this.total_combustivel = total_combustivel;
    }

    public String calculate() {
        double resultado = FormatadorNumeros.tresCasasDecimaisComPonto(getDistancia_total() / getTotal_combustivel());

        return FormatadorNumeros.removeTrocaVirgulaPonto(resultado) + " km/l";
    }

    public int getDistancia_total() {
        return distancia_total;
    }

    public void setDistancia_total(int distancia_total) {
        this.distancia_total = distancia_total;
    }

    public double getTotal_combustivel() {
        return total_combustivel;
    }

    public void setTotal_combustivel(double total_combustivel) {
        this.total_combustivel = total_combustivel;
    }
}
