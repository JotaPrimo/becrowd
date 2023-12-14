package br.com.classes;

import br.com.utils.FormatadorNumeros;

public class Snack {
    private int code;
    private int quantidade;
    private String valorTotal = "Total: R$ ";

    public Snack(int code, int quantidade) {
        this.code = code;
        this.quantidade = quantidade;
    }

    public String calcularPreco() {
        double preco = 0.0;
        switch (this.getCode()) {
            case 1:
                preco = this.quantidade * 4;
                break;
            case 2:
                preco = this.quantidade * 4.5;
                break;
            case 3:
                preco = this.quantidade * 5;
                break;
            case 4:
                preco = this.quantidade * 2;
                break;
            case 5:
                preco = this.quantidade * 1.5;
                break;
        }
        setValorTotal(this.valorTotal.concat(String.valueOf(FormatadorNumeros.formatarDuasCasasDecimais(preco))));
        return this.valorTotal;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }
}
