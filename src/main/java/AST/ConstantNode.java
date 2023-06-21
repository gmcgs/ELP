package AST;

public class ConstantNode extends ASTNode {
    private String identifier;
    private String value;
    private String type;

    public ConstantNode(String identifier, String value, String type) {
        this.identifier = identifier;
        this.value = value;
        this.type = type;
    }
}
