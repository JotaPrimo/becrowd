package br.com.classes;

public class GameTime {
    private int hora_inicio;
    private int hora_fim;

    public GameTime(int hora_inicio, int hora_fim) {
        this.hora_inicio = hora_inicio;
        this.hora_fim = hora_fim;
    }

    public String processar() {
        int horas = 0;

        if (getHora_inicio() == getHora_fim()) {
            horas = 24;
        }

        if (getHora_inicio() > getHora_fim()) {
            horas = (24 - getHora_inicio()) + getHora_fim();
        }

        if (getHora_inicio() < getHora_fim()) {
            horas = getHora_fim() - getHora_inicio();
        }

        return "O JOGO DUROU " +horas+ " HORA(S)\n";
    }

    public int getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(int hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public int getHora_fim() {
        return hora_fim;
    }

    public void setHora_fim(int hora_fim) {
        this.hora_fim = hora_fim;
    }

}
