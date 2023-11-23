package br.com.classes;

public class ExtremelyBasic {

    private Integer A;
    private Integer B;
    private String X;

    public ExtremelyBasic() {
    }

    public ExtremelyBasic(Integer a, Integer b) {
        A = a;
        B = b;
        X = "X = " + (a + b);
    }

    public Integer returnSoma() {
        return A + B;
    }

    public Integer getA() {
        return A;
    }

    public void setA(Integer a) {
        A = a;
    }

    public Integer getB() {
        return B;
    }

    public void setB(Integer b) {
        B = b;
    }

    public String getX() {
        return X;
    }

    public void setX(String x) {
        X = x;
    }
}
