package ch.gibb.modelView;

import ch.gibb.Zeichnung;
import ch.gibb.formen.Kreis;
import ch.gibb.formen.Linie;
import ch.gibb.formen.Rechteck;

import java.awt.Graphics;
import java.awt.Point;

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

        switch (figurTyp) {
            case 'r':
                zeichnung.hinzufuegen(new Rechteck(ersterPunkt, zweiterPunkt));
            case 'l':
                zeichnung.hinzufuegen(new Linie(ersterPunkt, zweiterPunkt));
            case 'k':
                zeichnung.hinzufuegen(new Kreis(ersterPunkt, zweiterPunkt));
            default:
                zeichnung.hinzufuegen(new Linie(ersterPunkt, zweiterPunkt));
        }
    }
}
