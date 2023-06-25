package ch.gibb;

import ch.gibb.model.Figur;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;


public class FigurParserTest {

    private FigurDAO dao;
    private FigurParser fp;

    @Before
    public void setup() {
        dao = new FigurDAOStub();
        fp = new FigurParser(dao);
    }

    @Test
    public void test() {
        List<Figur> figuren = fp.parse();
        assertEquals(3, figuren.size());
        assertEquals("Rechteck{breite=100, hoehe=20, positionX=20, positionY=10}", figuren.get(0).toString());
        assertEquals("Kreis{radius=10, positionX=30, positionY=30}", figuren.get(1).toString());
        assertEquals("Linie{endpunktX=200, endpunktY=200, positionX=50, positionY=50}", figuren.get(2).toString());
    }
}
