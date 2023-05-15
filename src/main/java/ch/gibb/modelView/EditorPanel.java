package ch.gibb.modelView;


import java.awt.Graphics;


import javax.swing.JPanel;


@SuppressWarnings("serial")
final class EditorPanel extends JPanel {
    private EditorControl editorControl;

    EditorPanel(EditorControl editorControl) {
        addMouseListener(new EditorMouseAdapter(editorControl));
        this.editorControl = editorControl;
    }

    // Die paintComponent()-Methode wird automatisch aufgerufen, wenn irgendwer die repaint()-
    // Methode beim EditorFrame oder beim EditorPanel aufruft.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        editorControl.allesNeuZeichnen(g);
    }


}