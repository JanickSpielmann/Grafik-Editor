package ch.gibb.formen;

import java.awt.*;

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
    @Override
    public void zeichne(Graphics g) {
        g.drawOval(positionX,positionY,breite,hoehe);
    }
}
