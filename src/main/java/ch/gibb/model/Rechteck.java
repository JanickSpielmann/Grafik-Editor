package ch.gibb.model;


import com.fasterxml.jackson.annotation.JsonTypeName;

import java.awt.*;

@JsonTypeName("Rechteck")
public class Rechteck extends Figur{


    protected int breite;
    protected int hoehe;


    public Rechteck(){
        super();
    }


    public Rechteck(Point ersterPunkt, Point zweiterPunkt) {
        super(ersterPunkt);

        setStartPoint(ersterPunkt, zweiterPunkt);


        this.breite = Math.abs(ersterPunkt.x - zweiterPunkt.x);
        this.hoehe = Math.abs(ersterPunkt.y - zweiterPunkt.y);

    }

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

    private void setStartPoint(Point ersterPunkt, Point zweiterPunkt) {

        if (ersterPunkt.x > zweiterPunkt.x)
            setPositionX(zweiterPunkt.x);

        if (ersterPunkt.y > zweiterPunkt.y) {
            setPositionY(zweiterPunkt.y);
        }
    }
    @Override
    public void zeichne(Graphics g) {
        g.drawRect(positionX, positionY, breite, hoehe);
    }
    @Override
    public Figur createFigur() {
        return new Linie(positionX, positionY, breite, hoehe);
    }

    @Override
    public String toString() {
        return "Rechteck{" +
                "breite=" + breite +
                ", hoehe=" + hoehe +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
