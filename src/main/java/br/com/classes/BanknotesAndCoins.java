package br.com.classes;

public class BanknotesAndCoins {
    private double valor;
    private int quantidade_notas;

    private Banknote banknote;

    public BanknotesAndCoins(double valor) {
        this.valor = valor;
        banknote = new Banknote((int) valor);
    }

    public void calculate() {
        System.out.println("NOTAS:");
        System.out.println(banknote.returnQtdNotasCem() + " nota(s) de R$ 100,00");
        System.out.println(banknote.returnQtdNotasCinquenta() + " nota(s) de R$ 50,00");
        System.out.println(banknote.returnQtdNotasVinte() + " nota(s) de R$ 20,00");
        System.out.println(banknote.returnQtdNotas10() + " nota(s) de R$ 10,00");
        System.out.println(banknote.returnQtdNotas5() + " nota(s) de R$ 5,00");
        System.out.println(banknote.returnQtdNotas2() + " nota(s) de R$ 2,00");
        // transformando em centavos o resto
        valor = valor * 100;

        System.out.println(returnQtdMoedasUmReal() + " moeda(s) de R$ 1.00");
        System.out.println(returnQtdMoedasCinquentaCentavos() + " moeda(s) de R$ 0.50");
        System.out.println(returnQtdMoedasVinteCincoCentavos() + " moeda(s) de R$ 0.25");
        System.out.println(returnQtdMoedasDezCentavos() + " moeda(s) de R$ 0.10");
        System.out.println(returnQtdMoedasCincoCentavos() + " moeda(s) de R$ 0.05");
        System.out.println(quantidade_notas + " moeda(s) de R$ 0.01");
    }

    public String returnResultado() {
        return
                this.valor + "\n" +
                        banknote.returnQtdNotasCem() + " nota(s) de R$ 100.00\n"
                        + banknote.returnQtdNotasCinquenta() + " nota(s) de R$ 50.00\n"
                        + banknote.returnQtdNotasVinte() + " nota(s) de R$ 20.00\n"
                        + banknote.returnQtdNotas10() + " nota(s) de R$ 10.00\n"
                        + banknote.returnQtdNotas5() + " nota(s) de R$ 5.00\n"
                        + banknote.returnQtdNotas2() + " nota(s) de R$ 2.00\n"
                        + "MOEDAS:\n"
                        + returnQtdMoedasUmReal() + " moeda(s) de R$ 1.00\n"
                        + returnQtdMoedasCinquentaCentavos() + " moeda(s) de R$ 0.50\n"
                        + returnQtdMoedasVinteCincoCentavos() + " moeda(s) de R$ 0.25\n"
                        + returnQtdMoedasDezCentavos() + " moeda(s) de R$ 0.10\n"
                        + returnQtdMoedasCincoCentavos() + " moeda(s) de R$ 0.05\n"
                        + quantidade_notas + " moeda(s) de R$ 0.01\n";
    }

    public int returnQtdMoedasUmReal() {
        valor = valor * 100;
        if (valor >= 100) {
            int moedasUmReal = (int) Math.floor(this.valor / 100);
            this.valor %= 100;
            return moedasUmReal;
        }
        return 0;
    }

    public int returnQtdMoedasCinquentaCentavos() {
        if (valor >= 50) {
            int cinquentaCentavos = (int) Math.floor(this.valor / 50);
            this.valor %= 50;
            return cinquentaCentavos;
        }
        return 0;
    }

    public int returnQtdMoedasVinteCincoCentavos() {
        if (valor >= 25) {
            int vinteCincoCentavos = (int) Math.floor(this.valor / 25);
            this.valor %= 25;
            return vinteCincoCentavos;
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


}
