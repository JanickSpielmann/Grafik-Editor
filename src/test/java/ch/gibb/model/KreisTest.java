package ch.gibb.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;


class KreisTest {
    private GraphicsStub g = new GraphicsStub();
    @Test
    void zeichne() {
        Kreis k = new Kreis(100,200,10);git c

        k.zeichne(g);

        assertEquals(1,g.nbOfDrawOvalCalls);
        assertEquals(90,g.x); // x - radius
        assertEquals(190,g.y); // y - radius
        assertEquals(20,g.width); // radius*2
        assertEquals(20,g.height); // radius*2
        assertEquals(g.width, g.height); // kreis ist gleich breit wie hoch




    }

}