package ch.gibb.modelView;

public final class Grafikeditor {

    private EditorFrame editorFrame;
    public Grafikeditor() {
      this.editorFrame = new EditorFrame(800,600);
    }

    public static void main(String[] args) {
        new Grafikeditor();
    }

}
