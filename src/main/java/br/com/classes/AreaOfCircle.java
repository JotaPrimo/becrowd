package br.com.classes;

import br.com.utils.FormatadorNumeros;

public class AreaOfCircle {

    private final Double PI = 3.14159;
    private Double raio;

    public AreaOfCircle(Double raio) {
        this.raio = FormatadorNumeros.duasCasasDecimaisComPonto(raio);
    }

    public String calculateArea() {

        Double area = (raio * raio) * PI;

        double areaFormatada = FormatadorNumeros.quatroCasasDecimaisComPonto(area);
        return "A=" + areaFormatada + "\n";
    }


    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }


}
