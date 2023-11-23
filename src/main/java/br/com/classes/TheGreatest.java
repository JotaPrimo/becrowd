package br.com.classes;

public class TheGreatest {
    private int a;
    private int b;
    private int c;

    public TheGreatest(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String calcularTheGreatest() {
        int greatest = ( returnSomaAB() + returnProdutoABC() * (returnDiferenceAB()) )  / 2;
        return greatest + " eh o maior";
    }

    public int returnDiferenceAB() {
        System.out.println("returnDiferenceAB  => " + (this.getA() - this.getB()));
        System.out.println("A => " + this.getA() +" B => " + this.getB());
        return this.getA() - this.getB();
    }

    public int returnProdutoABC() {
        System.out.println("returnProdutoABC  => " + (this.getA() * this.getB() * this.getC()));
        System.out.println("A => " + this.getA() +" B => " + this.getB() +" C => " + this.getC());
        return this.getA() * this.getB() * this.getC();
    }

    public int returnSomaAB() {
        System.out.println("returnSomaAB => " + (this.getA() + this.getB()));
        System.out.println("A => " + this.getA() +" B => " + this.getB());
        return this.getA() + this.getB();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }


}
