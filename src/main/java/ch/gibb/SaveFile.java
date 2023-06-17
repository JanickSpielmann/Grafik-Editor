package ch.gibb;

import ch.gibb.formen.Figur;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

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
