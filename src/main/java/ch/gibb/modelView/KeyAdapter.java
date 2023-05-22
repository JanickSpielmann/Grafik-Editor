package ch.gibb.modelView;

import java.awt.event.KeyEvent;

public class KeyAdapter extends java.awt.event.KeyAdapter {

    private EditorControl editorControl;

    public KeyAdapter(EditorControl editorControl) {
        this.editorControl = editorControl;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);
        editorControl.setFigurTyp(e.getKeyChar());
        System.out.println(e.getKeyChar());
    }
}
