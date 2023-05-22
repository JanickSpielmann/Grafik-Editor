package ch.gibb.modelView;


import java.awt.event.MouseEvent;

public class MouseAdapter extends java.awt.event.MouseAdapter {

    private EditorControl editorControl;
    private EditorPanel editorPanel;

    public MouseAdapter(EditorControl editorControl, EditorPanel editorPanel) {

        this.editorPanel = editorPanel;

        this.editorControl = editorControl;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        editorControl.setErsterPunkt(e.getPoint());
        System.out.println(e.getPoint());

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        editorControl.erzeugeFigurMitZweitemPunkt(e.getPoint());
        System.out.println(e.getPoint());
        editorPanel.repaint();


    }
}
