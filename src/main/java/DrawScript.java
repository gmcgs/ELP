import AST.ASTBuilder;
import AST.ASTNode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DrawScript {
    public static void main(String[] args) {
        //try{
            /*Path path = Paths.get("src/script.txt");
            String script = new String(Files.readAllBytes(path));
            CharStream input = CharStreams.fromString(script);
            TestLexer lexer = new TestLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TestParser parser = new TestParser(tokens);
            ScriptInterpreter scriptInterpreter = new ScriptInterpreter();
            parser.addParseListener(scriptInterpreter);
            ParseTree parseTree = parser.script();*/
            String script1 = "N: 8\nSIDE: 40\nMARGIN: 5\nBLACK: |0|\nWHITE: |255|\nGRAY: |128|";
            TestLexer lexer1 = new TestLexer(CharStreams.fromString(script1));
            CommonTokenStream tokens1 = new CommonTokenStream(lexer1);
            TestParser parser1 = new TestParser(tokens1);
            ParseTree parseTree1 = parser1.script();
            ASTBuilder astBuilder = new ASTBuilder();
            ASTNode astTree = astBuilder.buildAST(parseTree1);
            System.out.println(astTree.toString());

        //}
    }

    public static class Interpreter {
    }
}
