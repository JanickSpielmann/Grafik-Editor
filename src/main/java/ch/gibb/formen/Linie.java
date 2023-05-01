package ch.gibb.formen;

public class Linie extends Figur {
    private int endpunktX;
    private int endpunktY;

    public Linie(int positionX, int positionY, int endpunktX, int endpunktY) {
        super(positionX, positionY);
        this.endpunktX = endpunktX;
        this.endpunktY = endpunktY;
    }

    public int getEndpunktX() {
        return endpunktX;
    }

    public void setEndpunktX(int endpunktX) {
        this.endpunktX = endpunktX;
    }

    public int getEndpunktY() {
        return endpunktY;
    }

    public void setEndpunktY(int endpunktY) {
        this.endpunktY = endpunktY;
    }
}
