package ch.gibb.formen;

public class Linie extends Figur {
    private int endpunktX;
    private int endpunktY;

    public Linie(int positionX, int positionY, int endpunktX, int endpunktY) {
        super(positionX, positionY);
        this.endpunktX = endpunktX;
        this.endpunktY = endpunktY;
    }
}
