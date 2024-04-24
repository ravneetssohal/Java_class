package OOPs.encapsulation;

public class PragraWordEditor {
    private String text;

    public PragraWordEditor(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return text;
    }
}
