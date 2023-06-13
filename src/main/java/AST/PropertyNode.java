package AST;

public class PropertyNode extends ASTNode {
    private String name;
    private String value;

    public PropertyNode(String name, String value) {
        this.name = name;
        this.value = value;
    }
}
