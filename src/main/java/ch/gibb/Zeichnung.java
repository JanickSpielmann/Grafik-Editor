package ch.gibb;

import ch.gibb.formen.Figur;

import java.awt.*;
import java.util.ArrayList;

public class Zeichnung{

    private ArrayList<Figur> figuren;

    public Zeichnung(ArrayList <Figur> figuren) {
        this.figuren = figuren;
    }

    public Zeichnung(){
        this.figuren = new ArrayList<>();
    }

    public void zeichneFiguren(Graphics g){
        for (Figur f: figuren){
            f.zeichne(g);
        }
    }
    public void move (int dx, int dy){

    }
    public void hinzufuegen(Figur figur){

        figuren.add(figur);

    }


    public void allesLoeschen() {
        figuren.removeAll(figuren);
    }

}
