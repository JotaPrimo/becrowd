package br.com.classes;

import br.com.utils.FormatadorNumeros;

public class Salary {
    private int numeroFuncionairo;
    private int horas_trabalhadas;
    private double valor_hora;

    public Salary(int numeroFuncionairo, int horas_trabalhadas, double valor_hora) {
        this.numeroFuncionairo = validarNumeroFuncionario(numeroFuncionairo);
        this.horas_trabalhadas = horas_trabalhadas;
        this.valor_hora = formatarValorHorasTrabalhadas(valor_hora);
    }

    public static double formatarValorHorasTrabalhadas(double valor) {
        double valorDouble = FormatadorNumeros.duasCasasDecimaisComPonto(valor);
        return FormatadorNumeros.removeTrocaVirgulaPonto(valorDouble);
    }

    public static int validarNumeroFuncionario(int numeroFuncionairo) {
        if (numeroFuncionairo < 1) {
            throw new RuntimeException("Número de funcionario não pode ser menor que 1");
        }
        return  numeroFuncionairo;
    }

    public String calcularSalario() {
        double salario = getHoras_trabalhadas() * getValor_hora();
        System.out.println("salario pre formatado " + salario);
        double salarioFormatado = FormatadorNumeros.duasCasasDecimaisComPonto(salario);
        System.out.println("salario formatado " + salarioFormatado);
        return "NUMBER = " +getNumeroFuncionairo()+  "\nSALARY = U$ " + salarioFormatado;
    }

    public int getNumeroFuncionairo() {
        return numeroFuncionairo;
    }

    public void setNumeroFuncionairo(int numeroFuncionairo) {
        this.numeroFuncionairo = numeroFuncionairo;
    }

    public int getHoras_trabalhadas() {
        return horas_trabalhadas;
    }

    public void setHoras_trabalhadas(int horas_trabalhadas) {
        this.horas_trabalhadas = horas_trabalhadas;
    }

    public double getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }
}
