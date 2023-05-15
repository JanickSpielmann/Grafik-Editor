package ch.gibb.formen;

import java.awt.*;

public class Rechteck extends Figur {


    protected int breite;
    protected int hoehe;


        public Rechteck(int positionX, int positionY, int breite, int hoehe) {
            super(positionX, positionY);
            this.breite = breite;
            this.hoehe = hoehe;
        }



        public Rechteck(int positionX, int positionY, Color linienFarbe, Color fullFarbe, int linienDicke, int style, int breite, int hoehe) {
            super(positionX, positionY, linienFarbe, fullFarbe, linienDicke, style);
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
        g.drawRect(positionX,positionY,breite,hoehe);
    }
}
