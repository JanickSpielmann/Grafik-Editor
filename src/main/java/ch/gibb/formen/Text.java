package ch.gibb.formen;

import java.awt.*;

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
    @Override
    public void zeichne(Graphics g) {
        g.setColor(linienFarbe);
        g.drawString(text,positionX,positionY);
    }
}
