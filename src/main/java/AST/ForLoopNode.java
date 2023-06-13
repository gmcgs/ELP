package AST;

import java.util.ArrayList;
import java.util.List;

public class ForLoopNode extends ASTNode {
    private String loopVariable;
    private int loopStart;
    private int loopEnd;
    private List<ASTNode> children;

    public ForLoopNode(String loopVariable, int loopStart, int loopEnd) {
        this.loopVariable = loopVariable;
        this.loopStart = loopStart;
        this.loopEnd = loopEnd;
        this.children = new ArrayList<>();
    }

    public String getLoopVariable() {
        return loopVariable;
    }

    public int getLoopStart() {
        return loopStart;
    }

    public int getLoopEnd() {
        return loopEnd;
    }

    public void addChild(ASTNode child) {
        children.add(child);
    }

    public List<ASTNode> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ForLoopNode: ")
                .append("Variable: ").append(loopVariable)
                .append(", Start: ").append(loopStart)
                .append(", End: ").append(loopEnd)
                .append("\n");
        for (ASTNode child : children) {
            sb.append(child.toString()).append("\n");
        }
        return sb.toString();
    }
}
