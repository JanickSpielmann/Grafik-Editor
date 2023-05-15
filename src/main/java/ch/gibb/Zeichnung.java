package ch.gibb;

import ch.gibb.formen.Figur;

import java.awt.*;

public class Zeichnung{

    private Figur[] figuren;

    public Zeichnung(Figur[] figuren) {
        this.figuren = figuren;
    }

    public Zeichnung(){
        this.figuren = new Figur[]{};
    }

    public void zeichneFiguren(Graphics g){
        for (Figur f: figuren){
            f.zeichne(g);
        }
    }
    public void move (int dx, int dy){

    }
    public void hinzufuegen(Figur figur){

        //  New array with 1 size increase
        Figur[] figurenNew = new Figur[this.figuren.length+1];
        // Copy everything from the old array into the new longer one
        for (int i = 0; i < this.figuren.length; i++) {
            figurenNew[i] = this.figuren[i];
        }
        //adding the new person on the last field from the array
        figurenNew[figurenNew.length-1] = figur;
        //replacing the instance array with the new one.
        this.figuren = figurenNew;

    }


    public void allesLoeschen(Display display) {
        figuren = new Figur[]{};
        display.repaint();
    }

}
