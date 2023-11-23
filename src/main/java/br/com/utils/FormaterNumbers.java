package br.com.utils;

import java.text.DecimalFormat;

public class FormaterNumbers {
    private double numero;

    public FormaterNumbers(double numero) {
        this.numero = numero;
    }

    public String formatarComUmaCasaDecimal() {
        return formatarNumero("#.0");
    }

    public String formatarComDuasCasasDecimais() {
        return formatarNumero("#.00");
    }

    public String formatarComTresCasasDecimais() {
        return formatarNumero("#.000");
    }

    public String formatarComQuatroCasasDecimais() {
        return formatarNumero("#.0000");
    }

    private String formatarNumero(String formato) {
        DecimalFormat df = new DecimalFormat(formato);
        return df.format(numero).replace(",", ".");
    }
}
