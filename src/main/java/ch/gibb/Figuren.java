package ch.gibb;

import ch.gibb.model.Figur;

import java.util.List;

public class Figuren {

    public static void main(String[] args) {
        FigurFileDAO dao = new FigurFileDAO();
        FigurParser fp = new FigurParser(dao);
        List<Figur> figuren = fp.parse();
        System.out.println(figuren);
        dao.close();

    }

}
