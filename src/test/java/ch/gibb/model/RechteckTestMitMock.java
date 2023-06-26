package ch.gibb.model;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RechteckTestMitMock {
    private Graphics g = mock(Graphics.class);

    @Test
    void zeichne() {
        Rechteck r = new Rechteck(10,20,30,40);
        r.zeichne(g);
        verify(g,times(1)).drawRect(10,20,30,40);
    }
}