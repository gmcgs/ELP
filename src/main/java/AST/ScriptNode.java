package AST;

import java.util.ArrayList;
import java.util.List;

public class ScriptNode extends ASTNode {
    private List<ASTNode> children;

    public ScriptNode() {
        children = new ArrayList<>();
    }

    public void addChild(ASTNode child) {
        children.add(child);
    }

    // Other methods specific to ScriptNode
}
