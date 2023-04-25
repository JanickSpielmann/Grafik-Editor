package ch.gibb;

import ch.gibb.formen.Kreis;
import ch.gibb.formen.Linie;
import ch.gibb.formen.Rechteck;

public class Main {

    private static final Display display = new Display();
    public static void main(String[] args) {

        Rechteck rechteck = new Rechteck(10,10,200,300);
        Rechteck rechteck2 = new Rechteck(20,20,500,300);
        Linie linie = new Linie(30,30,40,40);
        Linie linie2 = new Linie(90,80,70,50);
        Kreis kreis = new Kreis(50,50,25);
        Kreis kreis2 = new Kreis(60,60,80);

    }
}