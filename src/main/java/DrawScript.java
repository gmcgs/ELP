import AST.ASTBuilder;
import AST.ASTNode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DrawScript {
    static JFrame frame;
    static JPanel backgroundPanel;
    static JPanel frontPanel;
    public static Color liner = new Color(0,0,0);
    public static Color filler = new Color(255,255,255);
    public static Painter painter;
    public static int x=0;
    public static int y=0;

    public static class Painter extends JPanel{

        public List<Figure> figures = new ArrayList<>();

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (Figure figure : figures) {
                figure.draw(g);
            }
        }
        public List<Figure> getFigures() {
            return figures;
        }
    }

    interface Figure{
        void draw(Graphics g);
    }

    public static class Square implements Figure{
        private int x;
        private int y;
        private int size;

        public Square(int x, int y, int size) {
            this.x = x;
            this.y = y;
            this.size = size;
        }
        @Override
        public void draw(Graphics g) {
            g.setColor(filler);
            g.fillRect(x, y, size, size);
            g.setColor(liner);
            g.drawRect(x, y, size, size);
        }
    }

    public static class Rectangle implements Figure{
        private int x;
        private int y;
        private int width;
        private int height;

        public Rectangle(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
        @Override
        public void draw(Graphics g) {
            g.setColor(filler);
            g.fillRect(x, y, width, height);
            g.setColor(liner);
            g.drawRect(x, y, width, height);
        }
    }

    public static class Circle implements Figure {
        private int x;
        private int y;
        private int diameter;

        public Circle(int x, int y, int diameter) {
            this.x = x;
            this.y = y;
            this.diameter = diameter;
        }

        @Override
        public void draw(Graphics g) {
            g.setColor(filler);
            g.fillOval(x, y, diameter, diameter);
            g.setColor(liner);
            g.drawOval(x, y, diameter, diameter);
        }
    }

    public static class Ellipse implements Figure {
        private int x;
        private int y;
        private int width;
        private int height;

        public Ellipse(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        @Override
        public void draw(Graphics g) {
            g.setColor(filler);
            g.fillOval(x, y, width, height);
            g.setColor(liner);
            g.drawOval(x, y, width, height);
        }
    }
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
            frame = new JFrame("DrawScript");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setResizable(false);
            frame.setSize(400, 400);
            JLayeredPane layeredPane = new JLayeredPane();
            frame.setContentPane(layeredPane);
            backgroundPanel = new JPanel();
            backgroundPanel.setBackground(new Color(255,255,255));
            layeredPane.add(backgroundPanel, JLayeredPane.DEFAULT_LAYER);
            frontPanel = new JPanel();
            frontPanel.setOpaque(false);
            frontPanel.setLayout(null);
            painter = new Painter();
            CharStream input = CharStreams.fromString(fileContents.toString());
            TestLexer lexer = new TestLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TestParser parser = new TestParser(tokens);
            ScriptInterpreter scriptInterpreter = new ScriptInterpreter();
            parser.addParseListener(scriptInterpreter);
            ParseTree parseTree = parser.script();
            System.out.println(parseTree.toStringTree(parser));
            painter.setOpaque(false);
            painter.setBounds(0,0,x,y);
            frontPanel.add(painter);
            layeredPane.add(frontPanel, JLayeredPane.PALETTE_LAYER);
            System.out.println(painter.getFigures().size());
            System.out.println("Jframe");
            System.out.println(frame.getSize().toString());
            System.out.println("BackGround");
            System.out.println(backgroundPanel.getSize().toString());
            System.out.println(backgroundPanel.getX());
            System.out.println(backgroundPanel.getY());
            System.out.println("painter");
            painter.setSize(330,330);
            System.out.println(painter.getSize().toString());
            System.out.println(painter.getX());
            System.out.println(painter.getY());
            System.out.println("painter");
            System.out.println(frontPanel.getSize().toString());
            System.out.println(frontPanel.getX());
            System.out.println(frontPanel.getY());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
