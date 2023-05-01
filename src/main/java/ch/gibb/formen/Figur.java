package ch.gibb.formen;

import java.awt.*;

public class Figur {
    protected int positionX;
    protected int positionY;

    protected Color linienFarbe;

    protected Color fullFarbe;

    protected int linienDicke;
    protected int style;


    public Figur(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.linienFarbe = Color.black;
        this.fullFarbe = Color.white;
        this.linienDicke = 1;
        this.style = 1;
    }

    public Figur(int positionX, int positionY, Color linienFarbe, Color fullFarbe, int linienDicke, int style) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.linienFarbe = linienFarbe;
        this.fullFarbe = fullFarbe;
        this.linienDicke = linienDicke;
        this.style = style;
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

    public Color getLinienFarbe() {
        return linienFarbe;
    }

    public void setLinienFarbe(Color linienFarbe) {
        this.linienFarbe = linienFarbe;
    }

    public Color getFuellFarbe() {
        return fullFarbe;
    }

    public void setFuellFarbe(Color fuellFarbe) {
        this.fullFarbe = fuellFarbe;
    }

    public int getLinienDicke() {
        return linienDicke;
    }

    public void setLinienDicke(int linienDicke) {
        this.linienDicke = linienDicke;
    }

    public int getStyle() {
        return style;
    }

    public void setStyle(int style) {
        this.style = style;
    }
}


