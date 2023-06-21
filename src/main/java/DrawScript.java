import AST.ASTBuilder;
import AST.ASTNode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DrawScript {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("src/main/resources/grammar/script.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            StringBuilder fileContents = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                fileContents.append(line).append("\n");
            }
            bufferedReader.close();
            System.out.println(fileContents.toString());
            CharStream input = CharStreams.fromString(fileContents.toString());
            TestLexer lexer = new TestLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TestParser parser = new TestParser(tokens);
            ScriptInterpreter scriptInterpreter = new ScriptInterpreter();
            parser.addParseListener(scriptInterpreter);
            ParseTree parseTree = parser.script();
            System.out.println(parseTree.toStringTree(parser));
            ASTBuilder astBuilder = new ASTBuilder();
            ASTNode astTree = astBuilder.buildAST(parseTree);
            //System.out.println(astTree.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static class Interpreter {
    }
}
