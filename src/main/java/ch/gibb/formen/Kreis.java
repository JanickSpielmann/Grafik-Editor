package ch.gibb.formen;

public class Kreis extends Figur {


    private int radius;

    public Kreis(int positionX, int positionY, int radius) {
        super(positionX, positionY);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
