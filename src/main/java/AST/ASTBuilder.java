package AST;


import org.antlr.v4.runtime.tree.ParseTree;

public class ASTBuilder {
    public ASTNode buildAST(ParseTree parseTree) {
        return visit(parseTree);
    }

    private ASTNode visit(ParseTree parseTree) {
        String ruleName = parseTree.getClass().getSimpleName().replaceAll("Context$", "");

        switch (ruleName) {
            case "ScriptContext":
                System.out.println(parseTree);
                return visitScript(parseTree);
            case "ConstanteContext":
                System.out.println(parseTree);
                return visitConstant(parseTree);
            case "PropriedadeContext":
                System.out.println(parseTree);
                return visitPropriedade(parseTree);
            case "InstrucaoContext":
                System.out.println(parseTree);
                return visitInstrucao(parseTree);
            case "ColorCommandContext":
                System.out.println(parseTree);
                return visitColorCommand(parseTree);
            case "IfCommandContext":
                System.out.println(parseTree);
                return visitIfCommand(parseTree);
            case "ForLoopContext":
                System.out.println(parseTree);
                return visitForLoop(parseTree);
            default:
                System.out.println(parseTree);
                return null;
        }
    }

    private ScriptNode visitScript(ParseTree parseTree) {
        ScriptNode scriptNode = new ScriptNode();

        for (int i = 0; i < parseTree.getChildCount(); i++) {
            ParseTree child = parseTree.getChild(i);
            ASTNode childNode = visit(child);
            if (childNode != null) {
                scriptNode.addChild(childNode);
            }
        }

        return scriptNode;
    }

    private ConstantNode visitConstant(ParseTree parseTree) {
        String identifier = parseTree.getChild(0).getText();
        String value = parseTree.getChild(2).getText();
        String type = determineConstantType(value);

        return new ConstantNode(identifier, value, type);
    }

    private PropertyNode visitPropriedade(ParseTree parseTree) {
        String name = parseTree.getChild(0).getText();
        ParseTree valueNode = parseTree.getChild(2);

        if (valueNode.getChildCount() == 1) {
            String value = valueNode.getChild(0).getText();
            return new PropertyNode(name, value);
        } else if (valueNode.getChildCount() == 3) {
            String value = valueNode.getText();
            return new PropertyNode(name, value);
        }

        return null;
    }

    private DrawNode visitInstrucao(ParseTree parseTree) {
        String ruleName = parseTree.getChild(0).getClass().getSimpleName().replaceAll("Context$", "");
        switch (ruleName) {
            case "ColorCommandContext":
                return visitColorCommand(parseTree.getChild(0));
            case "FigureContext":
                // Handle figure-related instructions
                // Return the appropriate DrawNode based on the figure type
                break;
            case "EstruturaContext":
                // Handle estrutura-related instructions
                // Return the appropriate DrawNode based on the estrutura type
                break;
            // Handle other instruction types as per your grammar
        }

        return null;
    }

    private ColorNode visitColorCommand(ParseTree parseTree) {
        String colorType = parseTree.getChild(0).getText();
        String value = parseTree.getChild(1).getText();

        return new ColorNode(colorType, value);
    }

    private IfNode visitIfCommand(ParseTree parseTree) {
        ASTNode condition = visit(parseTree.getChild(1));
        IfNode ifNode = new IfNode(condition);

        int childCount = parseTree.getChildCount();
        for (int i = 3; i < childCount - 1; i += 2) {
            DrawNode instruction = (DrawNode) visit(parseTree.getChild(i));
            ifNode.addIfStatement(instruction);
        }

        if (childCount > 4 && parseTree.getChild(childCount - 1).getChildCount() > 0) {
            for (int i = 1; i < parseTree.getChild(childCount - 1).getChildCount() - 1; i += 2) {
                DrawNode instruction = (DrawNode) visit(parseTree.getChild(childCount - 1).getChild(i));
                ifNode.addElseStatement(instruction);
            }
        }

        return ifNode;
    }

    private ForLoopNode visitForLoop(ParseTree parseTree) {
        ForLoopNode forLoop = null;
        ParseTree currentLoop = parseTree;

        while (currentLoop.getChildCount() >= 9) {
            ParseTree loopNode = currentLoop.getChild(0);
            String loopVariable = loopNode.getChild(1).getText();
            int loopStart = Integer.parseInt(loopNode.getChild(3).getText());
            int loopEnd = Integer.parseInt(loopNode.getChild(5).getText());

            ForLoopNode loop = new ForLoopNode(loopVariable, loopStart, loopEnd);

            if (forLoop != null) {
                forLoop.addChild(loop);
            } else {
                forLoop = loop;
            }

            currentLoop = loopNode.getChild(8);
            for (int i = 0; i < currentLoop.getChildCount(); i++) {
                ASTNode child = visit(currentLoop.getChild(i));
                if (child != null) {
                    loop.addChild(child);
                }
            }
        }

        return forLoop;
    }

    private String determineConstantType(String value) {
        if(value.matches("\\d+,\\d+")){
            return "Ponto2D";
        } else if(value.matches("\\d+~\\d+")){
            return "Dimensão";
        } else if(value.matches("[\\[\\]]\\d+(?:,\\s*\\d+)?[\\[\\]]")){
            return "Intervalo";
        } else if(value.matches("(?:\\d+\\|){2}\\d+|\\|\\d+\\|")){
            return "Cor";
        } else if (value.matches("\\d+")) {
            return "Inteiro";
        } else if (value.equals("true") || value.equals("false")){
            return "Booleano";
        } else {
            return "Tipo de constante não definido";
        }
    }
}