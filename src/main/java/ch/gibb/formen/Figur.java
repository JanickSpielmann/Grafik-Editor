package ch.gibb.formen;

import java.awt.*;

public abstract class Figur {
    protected int positionX;
    protected int positionY;

    protected Color linienFarbe;

    protected Color fullFarbe;

    protected int linienDicke;
    protected int style;

    public Figur(Point ersterPunkt){
        this.positionX = ersterPunkt.x;
        this.positionY = ersterPunkt.y;
        this.linienFarbe = Color.black;
        this.fullFarbe = Color.white;
        this.linienDicke = 1;
        this.style = 1;
    }

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

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public abstract void zeichne(Graphics g);
}


