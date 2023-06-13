package AST;

public class ColorNode extends DrawNode {
    private String colorType;
    private String value;

    public ColorNode(String colorType, String value) {
        this.colorType = colorType;
        this.value = value;
    }
}
