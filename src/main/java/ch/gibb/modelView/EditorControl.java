package ch.gibb.modelView;

import ch.gibb.Zeichnung;
import ch.gibb.formen.Rechteck;

import java.awt.*;

final class EditorControl {
    private Zeichnung zeichnung = new Zeichnung();
    private char figurTyp;
    private Point ersterPunkt;

    public void allesNeuZeichnen(Graphics g) {
        //TODO: Erg�nzen
    }

    public void setFigurTyp(char figurTyp) {
        this.figurTyp = figurTyp;
    }

    public void setErsterPunkt(Point ersterPunkt) {
        this.ersterPunkt = ersterPunkt;
    }

    public void erzeugeFigurMitZweitemPunkt(Point zweiterPunkt) {

        switch (figurTyp){
            case 'r': zeichnung.hinzufuegen(new Rechteck(ersterPunkt.x,ersterPunkt.y, zweiterPunkt.x, zweiterPunkt.y));
            default: zeichnung.hinzufuegen(new Rechteck(ersterPunkt.x,ersterPunkt.y, zweiterPunkt.x, zweiterPunkt.y));
        }



    }
}
