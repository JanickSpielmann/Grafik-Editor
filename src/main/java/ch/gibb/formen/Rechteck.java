package ch.gibb.formen;

public class Rechteck extends Figur {


    private int breite;
    private int hoehe;

    public Rechteck(int positionX, int positionY, int breite, int hoehe) {
        super(positionX, positionY);
        this.breite = breite;
        this.hoehe = hoehe;
    }
}
