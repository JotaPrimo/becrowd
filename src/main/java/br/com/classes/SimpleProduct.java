package br.com.classes;

public class SimpleProduct {

    private int number_A;
    private int number_B;
    private int PROD;

    public SimpleProduct() {
    }

    public SimpleProduct(int number_A, int number_B) {
        this.number_A = number_A;
        this.number_B = number_B;
        this.PROD = number_A * number_B;
    }

    public String getResultadoFmt() {
        return "PROD = " + getPROD();
    }

    public int getNumber_A() {
        return number_A;
    }

    public void setNumber_A(int number_A) {
        this.number_A = number_A;
    }

    public int getNumber_B() {
        return number_B;
    }

    public void setNumber_B(int number_B) {
        this.number_B = number_B;
    }

    public int getPROD() {
        return PROD;
    }

    public void setPROD(int PROD) {
        this.PROD = PROD;
    }
}
