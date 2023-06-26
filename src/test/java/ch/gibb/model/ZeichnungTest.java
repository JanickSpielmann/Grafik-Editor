package ch.gibb.model;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class ZeichnungTest {

    private Graphics g = mock(Graphics.class);
    private ArrayList<Figur> figuren = new ArrayList<Figur>();
    private Zeichnung zeichnung;


    @Before
    public void setup() {

        figuren.add(new Rechteck(10, 20, 30, 40));
        figuren.add(new Kreis(100, 200, 10));
        figuren.add(new Linie(10, 20, 30, 40));
        zeichnung = new Zeichnung(figuren);
    }

    @Test
    public void zeichneFiguren() {

        zeichnung.zeichneFiguren(g);
        verify(g, times(1)).drawRect(10, 20, 30, 40);
        verify(g, times(1)).drawOval(90, 190, 20, 20);
        verify(g, times(1)).drawLine(10, 20, 30, 40);

    }
}