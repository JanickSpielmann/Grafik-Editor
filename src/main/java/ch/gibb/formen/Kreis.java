package ch.gibb.formen;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.awt.*;
import java.io.Serializable;
@JsonTypeName("Kreis")
public class Kreis extends Figur{


    private int radius;


    public Kreis() {
        super();
    }

    public Kreis(Point ersterPunkt, Point zweiterPunkt) {
        super(ersterPunkt);
        radius = (int) ersterPunkt.distance(zweiterPunkt);
    }

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

    @Override
    public void zeichne(Graphics g) {
        g.drawOval(positionX - radius, positionY - radius, radius * 2, radius * 2);
    }

    @Override
    public Figur createFigur() {
        return new Kreis(positionX, positionY, radius);
    }

    @Override
    public String toString() {
        return "Kreis{" +
                "radius=" + radius +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
