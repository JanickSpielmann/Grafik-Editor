package ch.gibb;

import ch.gibb.formen.Figur;

import java.util.ArrayList;

public class Gruppe {
    private ArrayList <Figur> figuren = new ArrayList<>();

    public Gruppe(ArrayList<Figur> figuren) {
        this.figuren = figuren;
    }

    public void hinzufugen(Figur figur){
        figuren.add(figur);
    }

    public void entfarnen(Figur figur){
        figuren.remove(figur);
    }

    public void entfarnen(int position){
        figuren.remove(position);
    }

    public ArrayList<Figur> getFiguren() {
        return figuren;
    }

    public void setFiguren(ArrayList<Figur> figuren) {
        this.figuren = figuren;
    }
}
