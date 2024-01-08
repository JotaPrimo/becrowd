package br.com.classes;

public class Triangle {
    private float a;
    private float b;
    private float c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String processar() {
        if (!isTriangulo()) {
            return "Area = " + calculatePerimetroTriangulo();
        } else {
            return "Perimetro = " + calculeAreaTrapezio();
        }
    }

    public boolean isTriangulo() {
        return (getA() + getB() > getC()) && (getB() + getC() > getA()) && (getA() + getC() > getB());
    }

    public float calculatePerimetroTriangulo() {
        return a + b;
    }

    public float calculeAreaTrapezio() {
        return ((a + b) * c) / 2;
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
}
