package ch.gibb.formen;

import java.awt.*;

public class RechteckRund extends Rechteck {

    private int bogenBreite;
    private int bogenHoehe;

    public RechteckRund(int positionX, int positionY, int breite, int hoehe, int bogenBreite, int bogenHoehe) {
        super(positionX, positionY, breite, hoehe);
        this.bogenBreite = bogenBreite;
        this.bogenHoehe = bogenHoehe;
    }

    public int getBogenBreite() {
        return bogenBreite;
    }

    public void setBogenBreite(int bogenBreite) {
        this.bogenBreite = bogenBreite;
    }

    public int getBogenHoehe() {
        return bogenHoehe;
    }

    public void setBogenHoehe(int bogenHoehe) {
        this.bogenHoehe = bogenHoehe;
    }

    @Override
    public void zeichne(Graphics g) {
        g.drawRoundRect(positionX,positionY,breite,hoehe,bogenBreite,bogenHoehe);
    }
}




