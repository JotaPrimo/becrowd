package br.com.classes;

public class BanknotesAndCoins {
    private float valor;

    public BanknotesAndCoins(float valor) {
        this.valor = valor;
    }

    public String calculate() {
        return
                "NOTAS:\n" +
                        returnQtdNotasCem() + " nota(s) de R$ 100.00\n"
                        + returnQtdNotasCinquenta() + " nota(s) de R$ 50.00\n"
                        + returnQtdNotasVinte() + " nota(s) de R$ 20.00\n"
                        + returnQtdNotas10() + " nota(s) de R$ 10.00\n"
                        + returnQtdNotas5() + " nota(s) de R$ 5.00\n"
                        + returnQtdNotas2() + " nota(s) de R$ 2.00\n"
                        + "MOEDAS:\n"
                        + returnQtdMoedasUmReal() + " moeda(s) de R$ 1.00\n"
                        + returnQtdMoedasCinquentaCentavos() + " moeda(s) de R$ 0.50\n"
                        + returnQtdMoedasVinteCincoCentavos() + " moeda(s) de R$ 0.25\n"
                        + returnQtdMoedasDezCentavos() + " moeda(s) de R$ 0.10\n"
                        + returnQtdMoedasCincoCentavos() + " moeda(s) de R$ 0.05\n"
                        + returnQtdMoedasUmCentavo() + " moeda(s) de R$ 0.01";
    }

    public int returnQtdNotasCem() {
        if (valor >= 100) {
            int notasCem = (int) Math.floor(this.valor / 100);
            this.valor %= 100;
            return notasCem;
        }
        return 0;
    }

    public int returnQtdNotasCinquenta() {
        if (valor >= 50) {
            int notas50 = (int) Math.floor(this.valor / 50);
            this.valor %= 50;
            return notas50;
        }
        return 0;
    }

    public int returnQtdNotasVinte() {
        if (valor >= 20) {
            int notas20 = (int) Math.floor(this.valor / 20);
            this.valor %= 20;
            return notas20;
        }
        return 0;
    }

    public int returnQtdNotas10() {
        if (valor >= 10) {
            int notas10 = (int) Math.floor(this.valor / 10);
            this.valor %= 10;
            return notas10;
        }
        return 0;
    }

    public int returnQtdNotas5() {
        if (valor >= 5) {
            int notas5 = (int) Math.floor(this.valor / 5);
            this.valor %= 5;
            return notas5;
        }
        return 0;
    }

    public int returnQtdNotas2() {
        if (valor >= 2) {
            int notas2 = (int) Math.floor(this.valor / 2);
            this.valor %= 2;
            return notas2;
        }
        return 0;
    }

    public int returnQtdMoedasUmReal() {
        this.valor *= 100;
        if (valor >= 100) {
            int moedasUmReal = (int) Math.floor(this.valor / 100);
            this.valor %= 100;
            return moedasUmReal;
        }
        return 0;
    }

    public int returnQtdMoedasCinquentaCentavos() {
        if (valor >= 50) {
            int moedasCinquentaCentavos = (int) Math.floor(this.valor / 50);
            this.valor %= 50;
            return moedasCinquentaCentavos;
        }
        return 0;
    }

    public int returnQtdMoedasVinteCincoCentavos() {
        if (valor >= 25) {
            int moedasVinteCincoCentavos = (int) Math.floor(this.valor / 25);
            this.valor %= 25;
            return moedasVinteCincoCentavos;
        }
        return 0;
    }

    public int returnQtdMoedasDezCentavos() {
        if (valor >= 10) {
            int moedasDezCentavos = (int) Math.floor(this.valor / 10);
            this.valor %= 10;
            return moedasDezCentavos;
        }
        return 0;
    }

    public int returnQtdMoedasCincoCentavos() {
        if (valor >= 5) {
            int moedasCincoCentavos = (int) Math.floor(this.valor / 5);
            this.valor %= 5;
            return moedasCincoCentavos;
        }
        return 0;
    }

    public int returnQtdMoedasUmCentavo() {
        return Math.round(this.valor);
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
