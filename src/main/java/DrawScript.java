import AST.ASTBuilder;
import AST.ASTNode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
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
            CharStream input = CharStreams.fromString(fileContents.toString());
            TestLexer lexer = new TestLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TestParser parser = new TestParser(tokens);
            ScriptInterpreter scriptInterpreter = new ScriptInterpreter();
            parser.addParseListener(scriptInterpreter);
            ParseTree parseTree = parser.script();
            scriptInterpreter.printFile();
            System.out.println(parseTree.toStringTree(parser));
            JFrame frame = new JFrame("DrawScript");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(scriptInterpreter.getDimensions().get(0),scriptInterpreter.getDimensions().get(1));
            frame.getContentPane().setBackground(scriptInterpreter.getBackground());
            frame.setVisible(true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
