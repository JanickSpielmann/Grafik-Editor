package ch.gibb.model;

import java.awt.*;

public class GraphicsStub extends ConcreteGraphics {

    int nbOfDrawRectCalls;
    int nbOfDrawOvalCalls;
    int x, y, width, height;


    @Override
    public void drawRect(int x, int y, int width, int height) {
        super.drawRect(x, y, width, height);
        nbOfDrawRectCalls++;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void drawOval(int x, int y, int width, int height) {
        super.drawOval(x, y, width, height);
        nbOfDrawOvalCalls++;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
