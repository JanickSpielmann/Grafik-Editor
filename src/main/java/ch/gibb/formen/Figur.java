package ch.gibb.formen;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.*;

import java.awt.*;


@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Linie.class, name = "Linie"),
        @JsonSubTypes.Type(value = Rechteck.class, name = "Rechteck"),
        @JsonSubTypes.Type(value = Kreis.class, name = "Kreis")

})


public abstract class Figur{




    protected int positionX;
    protected int positionY;


    public Figur() {
    }

    public Figur(Point ersterPunkt) {
        this.positionX = ersterPunkt.x;
        this.positionY = ersterPunkt.y;

    }

    public Figur(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;

    }

    public Figur(int positionX, int positionY, Color linienFarbe, Color fullFarbe, int linienDicke, int style) {
        this.positionX = positionX;
        this.positionY = positionY;

    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }


    public abstract void zeichne(Graphics g);


    public abstract Figur createFigur();

}


