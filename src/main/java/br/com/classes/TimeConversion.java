package br.com.classes;

public class TimeConversion {
    private int numberSeconds;

    public TimeConversion(int numberSeconds) {
        this.numberSeconds = numberSeconds;
    }

    public String calculate() {
        int horas  = retornarHoras();
        int minutos = retornarMinutos();
        return horas + ":" + minutos + ":" + numberSeconds;
    }

    public int retornarHoras() {
        int horas = numberSeconds / 3600;
        numberSeconds -= horas * 3600;
        return horas;
    }

    public int retornarMinutos() {
        int minutos = numberSeconds / 60;
        numberSeconds -= minutos * 60;
        return minutos;
    }

    public int getNumberMinutes() {
        return numberSeconds;
    }

    public void setNumberMinutes(int numberSeconds) {
        this.numberSeconds = numberSeconds;
    }

}
