package br.com.classes;

public class CoordinatesOfPoint {
    private double x;
    private double y;

    public CoordinatesOfPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String returnQuadrante() {
        if (this.getX() > 0 && this.getY() > 0) {
            return "Q1";
        } else if (this.getX() < 0 && this.getY() > 0) {
            return "Q2";
        } else if (this.getX() < 0 && this.getY() < 0) {
            return "Q3";
        } else if (this.getX() > 0 && this.getY() < 0) {
            return "Q4";
        } else if (this.getX() == 0 && this.getY() != 0) {
            return "Eixo Y";
        } else if (this.getX() != 0 && this.getY() == 0) {
            return "Eixo X";
        } else {
            // this.getX() == 0 && this.getY() == 0
            return "Origem";
        }
    }

    public void verificarQuadrante() {
        if (this.getX() > 0 && this.getY() > 0) {
            System.out.println("Q1");
            return;
        } else if (this.getX() < 0 && this.getY() > 0) {
            System.out.println("Q2");
            return;
        } else if (this.getX() < 0 && this.getY() < 0) {
            System.out.println("Q3");
            return;
        } else if (this.getX() > 0 && this.getY() < 0) {
            System.out.println("Q4");
            return;
        } else if (this.getX() == 0 && this.getY() != 0) {
            System.out.println("Eixo Y");
            return;
        } else if (this.getX() != 0 && this.getY() == 0) {
            System.out.println("Eixo X");
            return;
        } else if (this.getX() == 0 && this.getY() == 0) {
            System.out.println("Origem");
            return;
        }
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
