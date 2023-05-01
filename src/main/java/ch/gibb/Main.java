package ch.gibb;

import ch.gibb.formen.*;

import java.awt.*;


public class Main {

    private static final Display display = new Display();
    public static void main(String[] args) {


        Rechteck rechteck = new Rechteck(100,100, Color.RED,Color.BLUE,10,10,200,300);
        display.hinzufuegen(rechteck);
        Rechteck rechteck2 = new Rechteck(200,200,500,300);
        display.hinzufuegen(rechteck2);
        Linie linie = new Linie(300,300,450,450);
        display.hinzufuegen(linie);
        Linie linie2 = new Linie(350,550,170,150);
        display.hinzufuegen(linie2);
        Kreis kreis = new Kreis(500,500,25);
        display.hinzufuegen(kreis);
        Kreis kreis2 = new Kreis(600,600,80);
        display.hinzufuegen(kreis2);
        Elipse elipse = new Elipse(120,130,120,140);
        display.hinzufuegen(elipse);
        Elipse elipse2 = new Elipse(110,110,180,110);
        display.hinzufuegen(elipse2);
        Bogen bogen = new Bogen(120,120,190,110,40,50);
        display.hinzufuegen(bogen);
        Bogen bogen2 = new Bogen(180,210,120,110,200,100);
        display.hinzufuegen(bogen2);
        Text text = new Text(600,600,"Hallo");
        display.hinzufuegen(text);
        Text text2 = new Text(600,610,"Welt");
        display.hinzufuegen(text2);




    }
}