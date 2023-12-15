package br.com.classes;

public class AverageThree {
    private double N1;
    private double N2;
    private double N3;
    private double N4;
    private double notaExame;

    private double media;

    private final int PESO_1 = 1;
    private final int PESO_2 = 2;
    private final int PESO_3 = 3;
    private final int PESO_4 = 4;
    private final int SOMA_PESOS = 10;


    public AverageThree(double n1, double n2, double n3, double n4) {
        N1 = n1;
        N2 = n2;
        N3 = n3;
        N4 = n4;
    }

    public void calculateMedia() {
        double somaNotas = (N1 * PESO_2) + (N2 * PESO_3) + (N3 * PESO_4) + (N4 * PESO_1);

        setMedia(somaNotas / SOMA_PESOS);

        System.out.println("Media: " + this.media);
    }

    public boolean isAprovado() {
        if (this.media >= 7.0) {
            return true;
        }
        return false;
    }

    public boolean isReprovado() {
        if (this.media < 5.0) {
            return true;
        }
        return false;
    }

    public boolean isExame() {
        if (this.media >= 5.0 && this.media <= 6.9) {
            return true;
        }
        return false;
    }

    public void calculateNotaExame(double notaExame) {
        double mediaExame = (this.media + notaExame) / 2;
        setMedia(mediaExame);

        if (getMedia() >= 5.0) {
            System.out.println("Aluno aprovado.");
            System.out.println("Media final: " + getMedia());
        } else {
            System.out.println("Aluno reprovado.");
            System.out.println("Media final: " + getMedia());
        }

    }

    public double getN1() {
        return N1;
    }

    public void setN1(double n1) {
        N1 = n1;
    }

    public double getN2() {
        return N2;
    }

    public void setN2(double n2) {
        N2 = n2;
    }

    public double getN3() {
        return N3;
    }

    public void setN3(double n3) {
        N3 = n3;
    }

    public double getN4() {
        return N4;
    }

    public void setN4(double n4) {
        N4 = n4;
    }

    public double getNotaExame() {
        return notaExame;
    }

    public void setNotaExame(double notaExame) {
        this.notaExame = notaExame;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
