package ch.gibb;

public class FigurDAOStub implements FigurDAO {

    private String[] testFigurne = {"Rechteck,20,10,100,20",
            "Kreis,30,30,10",
            "Linie,50,50,200,200"};
    private int currentFigur = 0;

    @Override
    public String[] readNextFigurData() {
        if (currentFigur < testFigurne.length) {
            String[] figurData = testFigurne[currentFigur].split(",");
            currentFigur ++;
            return figurData;
        }
        return null;
    }
}
