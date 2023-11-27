package br.com.classes;

public class BhaskaraFormula {
    private float a;
    private float b;
    private float c;
    private double R1;
    private double R2;

    private double delta;

    public BhaskaraFormula(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean checarEquacaoIncompleta() {
        boolean a_diferente_zero = getA() != 0;
        boolean b_c_ou_ambos_zero = (getB() == 0) || (getC() == 0);

        if (a_diferente_zero || b_c_ou_ambos_zero) {
            return false;
        }
        return true;
    }

    public String calculate() {

        if (checarEquacaoIncompleta()) {
            return "Impossivel calcular\n";
        } else {
            setR1(calculateRaizXum());
            setR2(calculateRaizXDois());
            return "R1 = " + getR1() + "\n" + "R2 = " + getR2() + "\n";
        }
    }

    public double calculateRaizXum() {
        return (-1 * (getB()) + getDelta()) / (2 * getA());
    }

    public double calculateRaizXDois() {
        return (-1 * (getB()) - getDelta()) / (2 * getA());
    }

    public void calculateDelta() {
        setDelta(Math.sqrt((getB() * getB()) - 4 * a * c));
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public double getR1() {
        return R1;
    }

    public double getR2() {
        return R2;
    }

    public void setR1(double r1) {
        R1 = r1;
    }

    public void setR2(double r2) {
        R2 = r2;
    }

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }
}
