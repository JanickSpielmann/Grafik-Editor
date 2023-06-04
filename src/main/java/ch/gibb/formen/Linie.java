package ch.gibb.formen;

import java.awt.*;

public class Linie extends Figur {
    private int endpunktX;
    private int endpunktY;

    public Linie(Point ersterPunkt, Point zweiterPunkt){
        super(ersterPunkt);
        this.endpunktX = zweiterPunkt.x;
        this.endpunktY = zweiterPunkt.y;
    }

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

    @Override
    public void zeichne(Graphics g) {
        g.setColor(linienFarbe);
        g.drawLine(positionX,positionY,endpunktX,endpunktY);
    }
}
