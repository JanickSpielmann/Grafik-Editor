package ch.gibb.formen;

public class Bogen extends Figur {


    private int breite;
    private int hoehe;

    private int startWinkel;
    private int winkel;

    public Bogen(int positionX, int positionY, int breite, int hoehe, int startWinkel, int winkel) {
        super(positionX, positionY);
        this.breite = breite;
        this.hoehe = hoehe;
        this.startWinkel = startWinkel;
        this.winkel = winkel;
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public int getHoehe() {
        return hoehe;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    public int getStartWinkel() {
        return startWinkel;
    }

    public void setStartWinkel(int startWinkel) {
        this.startWinkel = startWinkel;
    }

    public int getWinkel() {
        return winkel;
    }

    public void setWinkel(int winkel) {
        this.winkel = winkel;
    }
}
