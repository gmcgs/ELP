import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DrawScript {
    public static void main(String[] args) {
        try{
            Path path = Paths.get("src/script.txt");
            String script = new String(Files.readAllBytes(path));
            CharStream input = CharStreams.fromString(script);
            TestLexer lexer = new TestLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TestParser parser = new TestParser(tokens);
            ScriptInterpreter scriptInterpreter = new ScriptInterpreter();
            parser.addParseListener(scriptInterpreter);
            parser.script();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
