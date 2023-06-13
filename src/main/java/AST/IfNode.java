package AST;

import java.util.ArrayList;
import java.util.List;

public class IfNode extends DrawNode {
    private ASTNode condition;
    private List<DrawNode> ifStatements;
    private List<DrawNode> elseStatements;

    public IfNode(ASTNode condition) {
        this.condition = condition;
        ifStatements = new ArrayList<>();
        elseStatements = new ArrayList<>();
    }

    public void addIfStatement(DrawNode statement) {
        ifStatements.add(statement);
    }

    public void addElseStatement(DrawNode statement) {
        elseStatements.add(statement);
    }

    // Getters and other methods specific to IfNode
}
