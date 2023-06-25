package ch.gibb.modelView;

import java.awt.event.KeyEvent;
import java.io.IOException;

public class KeyAdapter extends java.awt.event.KeyAdapter {

    private EditorControl editorControl;
    private EditorPanel editorPanel;

    public KeyAdapter(EditorControl editorControl, EditorPanel editorPanel) {
        this.editorControl = editorControl;
        this.editorPanel = editorPanel;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);
        if (e.getKeyCode() == KeyEvent.VK_DELETE) {
            editorControl.allesLoeschen();
            editorPanel.repaint();
        } else if (e.getKeyChar() == 's') {
            try {
                editorControl.speichern();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        } else if (e.getKeyChar() == 'g') {
            try {
                editorControl.laden();
                editorPanel.repaint();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        } else {
            editorControl.setFigurTyp(e.getKeyChar());
        }
        System.out.println(e.getKeyChar());
    }
}
