package ch.gibb.formen;

public class Elipse extends Figur {


    private int breite;
    private int hoehe;

    public Elipse(int positionX, int positionY, int breite, int hoehe) {
        super(positionX, positionY);
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public int getHoehe() {
        return hoehe;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }
}
