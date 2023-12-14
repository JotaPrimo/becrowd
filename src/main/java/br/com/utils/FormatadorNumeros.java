package br.com.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class FormatadorNumeros {

    public static double removeTrocaVirgulaPonto(double numero) {
        String oldValue = String.valueOf(numero).replace(',', '.');
        return Double.parseDouble(oldValue);
    }

    public static Double umaCasaDecimailComPonto(Double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);

        DecimalFormat decimalFormat = new DecimalFormat("#0.0", symbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(2);
        return Double.parseDouble(decimalFormat.format(numero));
    }

    public static Double duasCasasDecimaisComPonto(Double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);

        DecimalFormat decimalFormat = new DecimalFormat("#0.00", symbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(2);

        return  Double.parseDouble(decimalFormat.format(numero));
    }

    public static Double quatroCasasDecimaisComPonto(Double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);

        DecimalFormat decimalFormat = new DecimalFormat("#0.0000", symbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(2);
        double numeroDouble =  Double.parseDouble(decimalFormat.format(numero));
        return  removeTrocaVirgulaPonto(numeroDouble);
    }

    public static String cincoCasasDecimaisComPonto(Double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);

        DecimalFormat decimalFormat = new DecimalFormat("#0.00000", symbols);
        return decimalFormat.format(numero);
    }


    public static double tresCasasDecimaisComPonto(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);

        DecimalFormat decimalFormat = new DecimalFormat("#0.000", symbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(2);

        return  Double.parseDouble(decimalFormat.format(numero));
    }

    public static String formatarDuasCasasDecimais(double numero) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(numero).replace(',', '.');
    }

}
