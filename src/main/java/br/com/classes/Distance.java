package br.com.classes;


public class Distance {
    private int distance;

    public Distance(int distance) {
        this.distance = distance;
    }

    public String calculateDistance() {
        return distance * 2 + " minutos";
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

}
