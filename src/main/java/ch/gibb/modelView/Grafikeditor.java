package ch.gibb.modelView;

public final class Grafikeditor {

    EditorFrame editorFrame;
    public Grafikeditor() {
      this.editorFrame = new EditorFrame(1200,900);
    }

    public static void main(String[] args) {
        new Grafikeditor();
    }

}
