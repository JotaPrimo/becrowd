package br.com.classes;

public class AgeInDays {
    private int dias;

    public AgeInDays(int dias) {
        this.dias = dias;
    }

    public String calculate() {
        return returnAnos() + " ano(s)\n" + returnMeses() + " mês(es)\n" + this.dias + " dia(s)";
    }

    public int returnAnos() {
        int anos = dias / 365;
        dias -= anos * 365;
        return anos;
    }

    public int returnMeses() {
        int meses = dias / 30;
        dias -= meses * 30;
        return meses;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }


}
