package ch.gibb.modelView;

import ch.gibb.save.FigurSaver;
import ch.gibb.save.SaveFile;
import ch.gibb.Zeichnung;
import ch.gibb.formen.Figur;
import ch.gibb.formen.Kreis;
import ch.gibb.formen.Linie;
import ch.gibb.formen.Rechteck;

import java.awt.*;
import java.io.IOException;

public final class EditorControl {
    private Zeichnung zeichnung = new Zeichnung();
    private char figurTyp;
    private Point ersterPunkt;


    public void allesNeuZeichnen(Graphics g) {
        zeichnung.zeichneFiguren(g);
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
                break;
            case 'l':
                zeichnung.hinzufuegen(new Linie(ersterPunkt, zweiterPunkt));
                break;
            case 'k':
                zeichnung.hinzufuegen(new Kreis(ersterPunkt, zweiterPunkt));
                break;
            default:
                zeichnung.hinzufuegen(new Linie(ersterPunkt, zweiterPunkt));
                break;
        }
    }

    public void allesLoeschen(){
        zeichnung.allesLoeschen();
    }

    public void speichern() throws IOException {
        FigurSaver.save(zeichnung.getFiguren());
    }
    public void laden() throws IOException {
        SaveFile saveFile = FigurSaver.load();

        for (Figur figur :
                saveFile.figuren) {
            zeichnung.hinzufuegen(figur);
        }
    }
}