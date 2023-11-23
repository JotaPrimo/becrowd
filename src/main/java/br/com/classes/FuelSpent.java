package br.com.classes;

import br.com.utils.FormaterNumbers;

public class FuelSpent {
    private final double GASTO_MEDIO_KML = 12;
    private double combustivelGasto;
    private int tempoGasto;
    private int velocidade_media;

    public double calculateGastoCombustivel() {
        double gasto = (velocidade_media * tempoGasto) / GASTO_MEDIO_KML;
        String gastoFmt = (new FormaterNumbers(gasto)).formatarComTresCasasDecimais();
        return Double.parseDouble(gastoFmt);
    }

    public FuelSpent(int tempoGasto, int velocidade_media) {
        this.tempoGasto = tempoGasto;
        this.velocidade_media = velocidade_media;
    }

    public int getTempoGasto() {
        return tempoGasto;
    }

    public void setTempoGasto(int tempoGasto) {
        this.tempoGasto = tempoGasto;
    }

    public int getVelocidade_media() {
        return velocidade_media;
    }

    public void setVelocidade_media(int velocidade_media) {
        this.velocidade_media = velocidade_media;
    }

}
