package ch.gibb.save;

import ch.gibb.model.Figur;
import java.util.ArrayList;

public class SaveFile {
    public ArrayList<Figur> figuren;


    public SaveFile() {

    }


    public SaveFile(ArrayList<Figur> figuren) {
        this.figuren = figuren;
    }

    public ArrayList<Figur> getFiguren() {
        return figuren;
    }

    public void setFiguren(ArrayList<Figur> figuren) {
        this.figuren = figuren;
    }
}
