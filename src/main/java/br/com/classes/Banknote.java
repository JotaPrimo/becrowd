package br.com.classes;

public class Banknote {
    private int valor;
    private int quantidade_notas;

    public Banknote(int valor) {
        this.valor = valor;
    }

    public void calculate() {
        System.out.println(valor);
        System.out.println(returnQtdNotasCem() + " nota(s) de R$ 100,00");
        System.out.println(returnQtdNotasCinquenta() + " nota(s) de R$ 50,00");
        System.out.println(returnQtdNotasVinte() + " nota(s) de R$ 20,00");
        System.out.println(returnQtdNotas10() + " nota(s) de R$ 10,00");
        System.out.println(returnQtdNotas5() + " nota(s) de R$ 5,00");
        System.out.println(returnQtdNotas2() + " nota(s) de R$ 2,00");
        System.out.println(returnQtdNotas1() + " nota(s) de R$ 1,00");
    }

    public String returnResultado() {
        return
                this.valor + "\n" +
                        returnQtdNotasCem() + " nota(s) de R$ 100,00\n"
                        + returnQtdNotasCinquenta() + " nota(s) de R$ 50,00\n"
                        + returnQtdNotasVinte() + " nota(s) de R$ 20,00\n"
                        + returnQtdNotas10() + " nota(s) de R$ 10,00\n"
                        + returnQtdNotas5() + " nota(s) de R$ 5,00\n"
                        + returnQtdNotas2() + " nota(s) de R$ 2,00\n"
                        + returnQtdNotas1() + " nota(s) de R$ 1,00";
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

    public int returnQtdNotas1() {
        if (valor >= 1) {
            int notas1 = (int) Math.floor(this.valor / 1);
            this.valor %= 1;
            return notas1;
        }
        return 0;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getQuantidade_notas() {
        return quantidade_notas;
    }

    public void setQuantidade_notas(int quantidade_notas) {
        this.quantidade_notas = quantidade_notas;
    }
}
