package ch.gibb.formen;

public class Text extends Figur{

    private String text;

    public Text(int positionX, int positionY, String text) {
        super(positionX, positionY);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
