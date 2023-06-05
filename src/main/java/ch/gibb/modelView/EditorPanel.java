package ch.gibb.modelView;


import java.awt.Graphics;



import javax.swing.JPanel;
import javax.swing.text.JTextComponent;


@SuppressWarnings("serial")
final class EditorPanel extends JPanel {
    private EditorControl editorControl;

    public EditorPanel(EditorControl editorControl) {
        this.editorControl = editorControl;
        addMouseListener(new MouseAdapter(editorControl,this));
        setFocusable(true);
        addKeyListener(new KeyAdapter(editorControl, this));

    }

    // Die paintComponent()-Methode wird automatisch aufgerufen, wenn irgendwer die repaint()-
    // Methode beim EditorFrame oder beim EditorPanel aufruft.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        editorControl.allesNeuZeichnen(g);
    }


}