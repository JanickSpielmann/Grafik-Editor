
package ch.gibb;

import ch.gibb.formen.*;

import java.awt.*;
import java.util.ArrayList;


public class Main {


    private static final Display display = new Display();
    private static Zeichnung zeichnung = new Zeichnung(new ArrayList<Figur>());

    private static Gruppe gruppe = new Gruppe(new ArrayList<Figur>());

    public static void main(String[] args) {


        Rechteck rechteck = new Rechteck(100, 100, Color.RED, Color.BLUE, 10, 10, 200, 300);
        gruppe.hinzufugen(rechteck);
        Rechteck rechteck2 = new Rechteck(200, 200, 500, 300);
        gruppe.hinzufugen(rechteck2);
        Linie linie = new Linie(300, 300, 450, 450);
        gruppe.hinzufugen(linie);
        Linie linie2 = new Linie(350, 550, 170, 150);
        gruppe.hinzufugen(linie2);
        Kreis kreis = new Kreis(500, 500, 25);
        gruppe.hinzufugen(kreis);
        Kreis kreis2 = new Kreis(600, 600, 80);
        gruppe.hinzufugen(kreis2);
        Elipse elipse = new Elipse(120, 130, 120, 140);
        gruppe.hinzufugen(elipse);
        Elipse elipse2 = new Elipse(110, 110, 180, 110);
        gruppe.hinzufugen(elipse2);
        Bogen bogen = new Bogen(120, 120, 190, 110, 40, 50);
        gruppe.hinzufugen(bogen);
        Bogen bogen2 = new Bogen(180, 210, 120, 110, 200, 100);
        gruppe.hinzufugen(bogen2);
        Text text = new Text(600, 600, "Hallo");
        gruppe.hinzufugen(text);
        Text text2 = new Text(600, 610, "Welt");
        gruppe.hinzufugen(text2);
        RechteckRund rechteckRund = new RechteckRund(50, 60, 100, 200, 50, 30);
        gruppe.hinzufugen(rechteckRund);

        for (Figur f :
                gruppe.getFiguren()) {
            zeichnung.hinzufuegen(f);
        }

        display.setZeichnung(zeichnung);


    }
}